package MyPackage;

import java.util.Scanner;

public class lab1 {


    public static void main(String[] args) {
        System.out.print("Введите номер варианта: ");
        Scanner scn = new Scanner(System.in);
        double[] x = new double[2];
        double[] y = new double[2];
        for (int i = 0; i < 2; i++) {
            System.out.print("Введите значение х" + (i + 1) + ": ");
            x[i] = control(scn.next());
            System.out.print("Введите значение y" + (i + 1) + ": ");
            y[i] = control(scn.next());
        }
        System.out.println("Расстояние между точками = " + Math.sqrt(Math.pow((x[1] - x[0]), 2) + Math.pow((y[1] - y[0]), 2)));
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
        return Double.parseDouble(x);
    }
}