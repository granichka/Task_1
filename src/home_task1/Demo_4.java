package home_task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo_4 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Введите, сколько километров машина проезжает за день:");
            String nn = br.readLine();
            double n = Double.parseDouble(nn);

            System.out.println("Введите длину маршрута:");
            String mm = br.readLine();
            double m = Double.parseDouble(mm);

            int result = (int) Math.ceil(m/n);
            System.out.println("Результат: " + result);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
