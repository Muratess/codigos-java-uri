import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int prd1_cod = input.nextInt();
        int prd1_uni = input.nextInt();
        float prd1_preco = input.nextFloat();

        float prd1 = prd1_uni * prd1_preco;

        int prd2_cod = input.nextInt();
        int prd2_uni = input.nextInt();
        float prd2_preco = input.nextFloat();

        float prd2 = prd2_uni * prd2_preco;
        DecimalFormat df = new DecimalFormat("####.00");

        float prodResult = prd1 + prd2;

        System.out.println("VALOR A PAGAR:" + " " + "R$" + " " + df.format(prodResult));
    }
}