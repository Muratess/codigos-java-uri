import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) {
	    	Scanner input = new Scanner(System.in);
	    	int X;
			X = input.nextInt();

			for (int i=X; i<X+12; i++) {
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}
	    }

}