import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double PI = 3.14159;
        int R = sc.nextInt();

        double volume = (4.0 / 3) * PI * R * R * R;

        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("VOLUME" + " " + "=" + " " + df.format(volume));

    }
}