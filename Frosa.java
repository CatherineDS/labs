import java.util.Scanner;

/**
 * Created by krabbe on 10.04.16.
 */
public class Frosa extends Duckbills {
    @Override
    public void feeding() {
        System.out.println("Утконосята покормлены");
    }

    @Override
    public void offspring() {
        System.out.println("Яйцо отложено");
    }
    public static void fr(){
        int num;
        Frosa frosa = new Frosa();
        Scanner scn = new Scanner(System.in);
        Main main = new Main();
        num = main.control(scn.next());
        switch (num){
            case 1:
                frosa.offspring();
                main.v3();
                break;
            case 2:
                frosa.feeding();
                main.v3();
                break;
            case 3:
                main.v3();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Try again");
                fr();
        }
    }
}
