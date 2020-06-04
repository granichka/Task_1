package home_task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo_5 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {


            System.out.println("Введите высоту шеста:");
            String height = br.readLine();
            double h = Double.parseDouble(height);

            System.out.println("Введите, на сколько метров улитка поднимается за день:");
            String u = br.readLine();
            double up = Double.parseDouble(u);

            System.out.println("Введите, на сколько метров улитка опускается за ночь:");
            String d = br.readLine();
            double down = Double.parseDouble(d);


            int result = ((int)Math.ceil((h-up)/(up-down)))+1;
            System.out.println("Результат: " + result);





        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
