import java.util.Scanner;

/**
 * Created by krabbe on 10.04.16.
 */
public class Belka extends Dogs {
    @Override
    public void offspring() {
        System.out.println("Белка родила");
    }
    @Override
    public void feeding() {
        System.out.println("Кормление");
    }
    public static void bel(){
        int num;
        Belka belka = new Belka();
        Scanner scn = new Scanner(System.in);
        Main main = new Main();
        num = main.control(scn.next());
        switch (num){
            case 1:
                belka.offspring();
                main.v1();
                break;
            case 2:
                belka.feeding();
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
                bel();
        }
    }
}
