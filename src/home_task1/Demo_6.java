package home_task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo_6 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Введите первое число:");
            String first = br.readLine();
            int a = Integer.parseInt(first);
            System.out.println("Введите второе число:");
            String second = br.readLine();
            int b = Integer.parseInt(second);

            int result = (((a+b)/b - 1)*a + ((a+b)/a -1)*b)/(a/b + b/a);
            System.out.println("Результат: " + result);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
