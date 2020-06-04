package home_task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo_2 {

    public static void main(String[] args) {


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Введите номер урока: ");
            String first = br.readLine();
            int a = Integer.parseInt(first);
            a = a*45 + (a/2)*5 + ((a+1)/2-1)*15;
            int h = a/60+9;
            int m = a%60;

            System.out.printf("Время окончания урока: %s : %s", h, m);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
