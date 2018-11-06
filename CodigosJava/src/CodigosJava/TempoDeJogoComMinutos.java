import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int horaInicial,minutoInicial,horaFim,minutoFim, duracaoHoras,duracaoMinutos;
		horaInicial = teclado.nextInt();
		minutoInicial = teclado.nextInt();
		horaFim = teclado.nextInt();
		minutoFim = teclado.nextInt();
			
		if(horaInicial == horaFim && minutoInicial == minutoFim){
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}
		else if(horaInicial > horaFim){
			duracaoHoras = (24 - horaInicial) + horaFim ;
			
			if(minutoInicial>minutoFim){
				duracaoMinutos = 60- minutoInicial +minutoFim;
				duracaoHoras--;
				System.out.println("O JOGO DUROU "+duracaoHoras+" HORA(S) E "+duracaoMinutos+" MINUTO(S)");
			}
			else if(minutoInicial <= minutoFim){
				duracaoMinutos = minutoFim - minutoInicial ;
				System.out.println("O JOGO DUROU "+duracaoHoras+" HORA(S) E "+duracaoMinutos+" MINUTO(S)");
			}
		}
		else if(horaInicial <= horaFim){
			duracaoHoras = horaFim - horaInicial;

			if(minutoInicial>minutoFim){
				duracaoMinutos = 60- minutoInicial +minutoFim;
				duracaoHoras--;
				System.out.println("O JOGO DUROU "+duracaoHoras+" HORA(S) E "+duracaoMinutos+" MINUTO(S)");
			}
			else if(minutoInicial <= minutoFim){
				duracaoMinutos = minutoFim - minutoInicial ;
				System.out.println("O JOGO DUROU "+duracaoHoras+" HORA(S) E "+duracaoMinutos+" MINUTO(S)");
			}
		}

	}

}