import java.io.IOException;
import java.util.*;

public class Main {

    
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        int diferenca;
        
        diferenca = (A*B - C*D);
        
        System.out.println("DIFERENCA = " +diferenca);
    }
    
}