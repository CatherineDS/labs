package MyPackage;

import java.util.Scanner;

/**
 * Created by krabbe on 26.02.16.
 */
public class MyClass {


    public static void main(String[] args) {
        int num;
        System.out.print("Введите номер варианта: ");
        Scanner scn = new Scanner(System.in);
        num = scn.nextInt();
        switch (num)
        {
            case 1:
                double[] x = new double [2];
                double[] y = new double [2];
                for(int i=0;i<2;i++) {
                    System.out.print("Введите значение х"+(i+1)+": ");
                    x[i]=scn.nextDouble();
                    System.out.print("Введите значение y"+(i+1)+": ");
                    y[i]=scn.nextDouble();
                }
                System.out.println("Расстояние между точками = "+ Math.sqrt(Math.pow((x[1]-x[0]),2)+Math.pow((y[1]-y[0]),2)));
                break;
            case 2:
                double d;
                System.out.println("Введите длину ребра куба: ");
                d=control(scn.nextDouble());
                System.out.println("Объём куба = "+Math.pow(d,3)+"\nПлощадь боковой поверхности куба = "+(4*Math.pow(d,2)));
                break;
            case 3:
                final float g=9.80655f;
                double h;
                System.out.print("Введите высоту, с которой падает камень: ");
                h=control(scn.nextDouble());
                System.out.print("Время падения камня = "+Math.sqrt(2*h/g));
                break;
            default:
                System.out.println("Завершение программы");
                break;
        }

    }
    private static double control(double x)
    {
        Scanner scn = new Scanner(System.in);
        while (x<=0)
        {
            System.out.print("Ошибка ввода. Введите значение заново: ");
            x=scn.nextDouble();
        }
        return x;
    }

}
