import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        
        int a1 = input.nextInt();
        int b1 = input.nextInt();
        int c1 = input.nextInt();
        int d1 = input.nextInt();

        if (b1 > c1 && d1 > a1 && ((c1 + d1) > (a1 + b1)) && c1 > 0 && a1 > 0 && (a1 % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

    }
}