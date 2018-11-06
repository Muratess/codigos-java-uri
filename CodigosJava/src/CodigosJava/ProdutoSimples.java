import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A1 = input.nextInt();
        int B1 = input.nextInt();

        int PROD = A1 * B1;
        System.out.println("PROD " + "= " + PROD);
    }
}