import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int empNum = sc.nextInt();
        int empHours = sc.nextInt();
        float empWage = sc.nextFloat();

        float SALARY = empHours * empWage;

        DecimalFormat df = new DecimalFormat("####.00");

        System.out.println("NUMBER" + " " + "=" + " " + empNum);
        System.out.println("SALARY" + " " + "=" + " " + "U$" + " " + df.format(SALARY));
    }
}