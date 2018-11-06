import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int xSpeed = 60;
        int ySpeed = 90;
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        ySpeed = time * 2;
        System.out.println(ySpeed + " " + "minutos");

    }
}