package MyPackage;

import java.util.Scanner;

public class lab1 {


public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double d;
        System.out.println("Введите длину ребра куба: ");
        d = control(scn.next());
        System.out.println("Объём куба = " + Math.pow(d, 3) + "\nПлощадь боковой поверхности куба = " + (4 * Math.pow(d, 2)));
    }

    private static double control(String x) {
        Scanner scn = new Scanner(System.in);
        boolean b;
        do {
            b=false;
            try {
                Double.parseDouble(x);
            } catch (NumberFormatException e) {
                b=true;
                System.out.print("Ошибка ввода. Введите значение заново: ");
                x = scn.next();
            }
        }while (b==true);
        while (Double.parseDouble(x) <= 0) {
            System.out.print("Ошибка ввода. Введите значение заново: ");
            x = scn.next();
        }
        return Double.parseDouble(x);

    }
}
