import java.util.Scanner;

/**
 * Created by krabbe on 10.04.16.
 */
public class Murka extends Cats {
    @Override
    public void feeding() {
        System.out.println("Кормление котят");
    }

    @Override
    public void offspring() {
        System.out.println("Мурка родила");
    }
    public static void mur(){
        int num;
        Murka murka = new Murka();
        Scanner scn = new Scanner(System.in);
        Main main = new Main();
        num = main.control(scn.next());
        switch (num){
            case 1:
                murka.offspring();
                main.v2();
                break;
            case 2:
                murka.feeding();
                main.v2();
                break;
            case 3:
                main.v2();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Try again");
                mur();
        }
    }
}
