import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int ini,fim, duracao;
		ini = teclado.nextInt();
		fim = teclado.nextInt();
			
		if(ini == fim){
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		else if(ini > fim){
			duracao = (24 - ini) + fim ;
			System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
		}
		else if(ini < fim){
			duracao = fim - ini;
			System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
		}

	}

}