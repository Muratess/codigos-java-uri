import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int ageDays = sc.nextInt();
        int years, months, days;

        years = ageDays / 365;
        months = (ageDays % 365) / 30;
        days = (ageDays % 365) % 30;
        System.out.println(years + " " + "ano(s)" + "\n" + months + " " + "mes(es)" + "\n" + days + " " + "dia(s)");

    }
}