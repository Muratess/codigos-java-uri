import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        float A = sc.nextFloat();
        float B = sc.nextFloat();

        float avg1 = ((A * 3.5f) + (B * 7.5f)) / 11f;

        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println("MEDIA" + " " + "=" + " " + df.format(avg1));
    }
}