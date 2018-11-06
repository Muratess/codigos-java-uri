import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num >= 1 && num <= 12) {
            num = num - 1;
            System.out.println(months[num]);
        }


    }
}