import java.io.IOException;
import java.util.Scanner;

public class Main{


	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		float a,b,c;
		a = teclado.nextFloat();
		b = teclado.nextFloat();
		c = teclado.nextFloat();


		if(a+b>c && b+c>a && a+c>b ){
			System.out.printf("Perimetro = %.1f\n" ,(a+b+c));
		}
		else{
			System.out.printf("Area = %.1f\n" ,((a+b)*c*0.5));

		}
	}
}