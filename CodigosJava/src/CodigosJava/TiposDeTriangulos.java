import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		 float a,b,c;
		 a = teclado.nextFloat();
		 b = teclado.nextFloat();
		 c = teclado.nextFloat();

		 if(a<b){
		 	float aux = b;
		 	b=a;
		 	a=aux;
		 }
		 if(a<c){
		 	float aux = c;
		 	c=a;
		 	a=aux;
		 }
		 if(b<c){
		 	float aux = b;
		 	b=c;
		 	c=aux;
		 }

		 if(a >= (b+c)){
		 	System.out.println("NAO FORMA TRIANGULO");
		 }else{
			 if((a*a) == ( (b*b) + (c*c) ))
			 	System.out.println("TRIANGULO RETANGULO");
			 if((a*a) > ( (b*b) + (c*c) ))
			 	System.out.println("TRIANGULO OBTUSANGULO");
			 if((a*a) < ( (b*b) + (c*c) ))
			 	System.out.println("TRIANGULO ACUTANGULO");
			 if(a == b && a == c)
			 	System.out.println("TRIANGULO EQUILATERO");
			 if((a == b || a == c || b == c) && (a != b || a != c) )
			 	System.out.println("TRIANGULO ISOSCELES");
		}


	}

}