import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int num_rem;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num);

        if (0 < num && num < 1000000) {
            if (num / 100 > 0) {
                num_rem = num / 100;
                num = num % 100;
                System.out.println(num_rem + " " + "nota(s) de R$ 100,00");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 100,00");
            }
            if (num / 50 > 0) {
                num_rem = num / 50;
                num = num % 50;
                System.out.println(num_rem + " " + "nota(s) de R$ 50,00");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 50,00");
            }
            if (num / 20 > 0) {
                num_rem = num / 20;
                num = num % 20;
                System.out.println(num_rem + " " + "nota(s) de R$ 20,00");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 20,00");
            }
            if (num / 10 > 0) {
                num_rem = num / 10;
                num = num % 10;
                System.out.println(num_rem + " " + "nota(s) de R$ 10,00");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 10,00");
            }
            if (num / 5 > 0) {
                num_rem = num / 5;
                num = num % 5;
                System.out.println(num_rem + " " + "nota(s) de R$ 5,00");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 5,00");
            }
            if (num / 2 > 0) {
                num_rem = num / 2;
                num = num % 2;
                System.out.println(num_rem + " " + "nota(s) de R$ 2,00");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 2,00");
            }
            if (num / 1 > 0) {
                num_rem = num / 1;
                num = num % 1;
                System.out.println(num_rem + " " + "nota(s) de R$ 1,00");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 1,00");
            }


        }

    }
}