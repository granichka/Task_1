package home_task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo_10 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Введите размер массива:");
            String size = br.readLine();
            int n = Integer.parseInt(size);

            int[] arr = new int[n];
            System.out.println("Введите "+n+" элементов массива через пробел в одну строку:");
            String[] numbers = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(numbers[i]);
            }

            int result = 0;
            for(int i = 1; i < n-1; i++) {

                if (arr[i] > arr[i+1] && arr[i] > arr[i-1]) {
                    result += 1;
                }

            }

            System.out.println("Результат: "+result);



        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
