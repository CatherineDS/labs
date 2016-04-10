import java.util.Scanner;

/**
 * Created by krabbe on 05.04.16.
 */
public class Main {
    public static void main(String[] args) {
        r1();
    }
    public static void r1(){
        int num;
        Scanner scn = new Scanner(System.in);
            mainmenu();
            num = control(scn.next());
            switch (num) {
                case 1:
                    v1();
                    break;
                case 2:
                    v2();
                    break;
                case 3:
                    v3();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Try again\n");
                    r1();
            }
    }
    private static void mainmenu(){
        System.out.println("Выберите ветку:\n1.Собаки\n2.Кошки\n3.Утконосы\n0.Выход из программы");
    }

    private static void last(){
        System.out.println("Выберите действие:\n1.Создать потомство\n2.Покормить потомство\n3.Назад\n0.Выход из программы");
    }
    public static void v1(){
        System.out.println("Выберите действие:\n1.Покормить Белку и Стрелку\n2.Выбрать Белку\n3.Выбрать Стрелку\n4.Назад\n0.Выход из программы");
        int num;
        Scanner scn = new Scanner(System.in);
        num = control(scn.next());
        Belka belka = new Belka();
        Strelka strelka = new Strelka();
        switch (num){
            case 1:
                Dogs dogs = new Dogs();
                dogs.feeding();
                break;
            case 2:
                last();
                belka.bel();
                break;
            case 3:
                last();
                strelka.str();
                break;
            case 4:
                r1();
                break;
            case 0:
                System.exit(0);
                default:
                    System.out.println("Try again");
                    v1();
                    break;
        }
        r1();
    }
    public static void v2(){
        System.out.println("Выберите действие:\n1.Покормить Мурку\n2.Выбрать Мурку\n3.Назад\n0.Выход из программы");
        int num;
        Scanner scn = new Scanner(System.in);
        num = control(scn.next());
        Murka murka = new Murka();
        Cats cats = new Cats();
        switch (num){
            case 1:
                cats.feeding();
                break;
            case 2:
                last();
                murka.mur();
                break;
            case 3:
                r1();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Try again\n");
                v2();
                break;
        }
        r1();
    }
    public static void v3(){
        System.out.println("Выберите действие:\n1.Покормить Фросу\n2.Выбрать Фросу\n3.Назад\n0.Выход из программы");
        Frosa frosa = new Frosa();
        Duckbills duckbills = new Duckbills();
        int num;
        Scanner scn = new Scanner(System.in);
        num = control(scn.next());
        switch (num){
            case 1:
                duckbills.feeding();
                break;
            case 2:
                last();
                frosa.fr();
                break;
            case 3:
                r1();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Try again\n");
                v3();
                break;
        }
        r1();
    }
    public static int control(String x) {
        Scanner scn = new Scanner(System.in);
        boolean b;
        do {
            b=false;
            try {
                Integer.parseInt(x);
            } catch (NumberFormatException e) {
                b=true;
                System.out.println("Try again\n");
                x = scn.next();
            }
        }while (b==true);
        while (Integer.parseInt(x) < 0) {
            System.out.println("Try again\n");
            x = scn.next();
        }
        return Integer.parseInt(x);

    }
}
