import java.util.Scanner;

/**
 * Created by krabbe on 10.04.16.
 */
public class Strelka extends Dogs {
    @Override
    public void feeding() {
        System.out.println("Кормление");
    }

    @Override
    public void offspring() {
        System.out.println("Стрелка родила");
    }
    public static void str(){
        int num;
        Strelka strelka = new Strelka();
        Scanner scn = new Scanner(System.in);
        Main main = new Main();
        num = main.control(scn.next());
        switch (num){
            case 1:
                strelka.offspring();
                main.v1();
                break;
            case 2:
                strelka.feeding();
                main.v1();
                break;
            case 3:
                main.v1();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Try again");
                str();
        }
    }
}
