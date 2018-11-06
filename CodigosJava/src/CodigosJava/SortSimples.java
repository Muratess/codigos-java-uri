import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);

			int valores[] = new int [6];
			valores[0] = teclado.nextInt();
			valores[1] = teclado.nextInt();
			valores[2] = teclado.nextInt();

			ordenar(valores);

			System.out.printf("%d\n%d\n%d\n\n",valores[3],valores[4],valores[5]);

			System.out.printf("%d\n%d\n%d\n",valores[0],valores[1],valores[2]);
	}

	public static void ordenar(int valores[]){

		if(valores[0] <= valores [1] && valores[0] <= valores[2]){
			valores[3] = valores[0];

			if(valores[1] <= valores[2]){
				valores[4] = valores[1];
				valores[5] = valores[2];
			}else{
				valores[4] = valores[2];
				valores[5] = valores[1];
			}


		} 
		else if(valores[1] <= valores [0] && valores[1] <= valores[2]){
			valores[3] = valores[1];

			if(valores[0] <= valores[2]){
				valores[4] = valores[0];
				valores[5] = valores[2];
			}else{
				valores[4] = valores[2];
				valores[5] = valores[0];
			}

		} 
		else if(valores[2] <= valores [1] && valores[2] <= valores[0]){
			valores[3] = valores[2];

			if(valores[1] <= valores[0]){
				valores[4] = valores[1];
				valores[5] = valores[0];
			}else{
				valores[4] = valores[0];
				valores[5] = valores[1];
			}
		} 
	}



}