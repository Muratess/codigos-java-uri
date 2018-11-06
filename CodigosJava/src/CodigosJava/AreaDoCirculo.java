import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
        public class Main {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);

            Scanner input = new Scanner(System.in);

        double PI = 3.14159;

        double R = input.nextDouble();

        double A = PI * (R * R);

        DecimalFormat df = new DecimalFormat("####.0000");
            System.out.println("A" + "=" + df.format(A));
    }
}