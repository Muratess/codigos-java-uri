import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int duration = sc.nextInt();
        int hours = 0, minutes = 0, seconds = 0;
        if (duration < 60) {
            seconds = seconds + duration;
            System.out.println(hours + ":" + minutes + ":" + seconds);
        } else if (duration >= 60 && duration < 3600) {
            minutes = duration / 60;
            seconds = duration % 60;
            System.out.println(hours + ":" + minutes + ":" + seconds);
        } else {
            hours = duration / 3600;
            minutes = (duration % 3600) / 60;
            seconds = (duration % 3600);
            seconds = seconds % 60;
            System.out.println(hours + ":" + minutes + ":" + seconds);

        }
    }
}