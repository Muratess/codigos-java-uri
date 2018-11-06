import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        float fuelSpent = sc.nextFloat();

        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(df.format(distance / fuelSpent) + " " + "km/l");
    }
}