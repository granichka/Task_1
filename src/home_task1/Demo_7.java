package home_task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo_7 {

    public static String method(int x1,int y1,int x2,int y2) {
        if(x1 == x2 || y1 == y2) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Введите x ладьи:");
            String xladia = br.readLine();
            int xl = Integer.parseInt(xladia);
            System.out.println("Введите y ладьи:");
            String yladia = br.readLine();
            int yl = Integer.parseInt(yladia);


            System.out.println("Введите x фигуры:");
            String xfigure = br.readLine();
            int xf = Integer.parseInt(xfigure);
            System.out.println("Введите y фигуры:");
            String yfigure = br.readLine();
            int yf = Integer.parseInt(yfigure);


            System.out.println("Результат: "+ method(xl, yl, xf, yf));


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
