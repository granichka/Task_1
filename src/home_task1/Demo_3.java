package home_task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo_3 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Введите часы первого момента времени:");
            String hours1 = br.readLine();
            int h1 = Integer.parseInt(hours1);
            System.out.println("Введите минуты первого момента времени:");
            String minutes1 = br.readLine();
            int m1 = Integer.parseInt(minutes1);
            System.out.println("Введите секунды первого момента времени:");
            String seconds1 = br.readLine();
            int s1 = Integer.parseInt(seconds1);

            System.out.println("Введите часы второго момента времени:");
            String hours2 = br.readLine();
            int h2 = Integer.parseInt(hours2);
            System.out.println("Введите минуты второго момента времени:");
            String minutes2 = br.readLine();
            int m2 = Integer.parseInt(minutes2);
            System.out.println("Введите секунды второго момента времени:");
            String seconds2 = br.readLine();
            int s2 = Integer.parseInt(seconds2);

            int result = (h2*3600+m2*60+s2)-(h1*3600+m1*60+s1);
            System.out.println("Результат: "+result);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
