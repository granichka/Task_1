package home_task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo_1 {

    public static void main(String[] args) {



        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Введите первое число: ");
            String first = br.readLine();
            int a = Integer.parseInt(first);
            System.out.println("Введите второе число: ");
            String second = br.readLine();
            int b = Integer.parseInt(second);

            System.out.println("До: "+a+" "+b);

            a = a + b;
            b = b - a;
            b = -b;
            a = a - b;


            System.out.println("После: "+a+" "+b);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
