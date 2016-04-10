package MyPackage;

import java.util.Scanner;

public class lab1 {


public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
                double d,v,s;
        System.out.println("Введите длину ребра куба: ");
        d = control(scn.next());
        v=Math.pow(d, 3);
        s=(4 * Math.pow(d, 2));
        System.out.println("Объём куба = " + v + "\nПлощадь боковой поверхности куба = " + s);
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
