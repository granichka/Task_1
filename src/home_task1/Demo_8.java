package home_task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo_8 {

    public static int method(int number1, int number2, int number3) {

        if (number1 == number2 && number1 == number3) {
            return 3;
        } else if (number1 == number2 || number1 == number3 || number2 == number3) {
            return 2;
        }

        return 0;
    }

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Введите первое число:");
            String firstNumber = br.readLine();
            int fn = Integer.parseInt(firstNumber);
            System.out.println("Введите второе число:");
            String secondNumber = br.readLine();
            int sn = Integer.parseInt(secondNumber);
            System.out.println("Введите третье число:");
            String thirdNumber = br.readLine();
            int thn = Integer.parseInt(thirdNumber);

            System.out.println("Результат: "+ method(fn, sn, thn));



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

