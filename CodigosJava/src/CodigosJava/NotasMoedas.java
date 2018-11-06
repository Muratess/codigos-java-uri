import java.io.IOException;
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		float dinheiro;
		int granaInt,granaDec;
		dinheiro = sc.nextFloat();
		granaInt = (int)dinheiro;
		granaDec = (int)Math.round((dinheiro - (int)dinheiro) * 100);
		
	//NOTAS
		System.out.println("NOTAS:");

		System.out.printf("%d nota(s) de R$ 100.00\n", granaInt/100);
		granaInt = granaInt % 100;

		System.out.printf("%d nota(s) de R$ 50.00\n", granaInt/50);
		granaInt = granaInt % 50;

		System.out.printf("%d nota(s) de R$ 20.00\n", granaInt/20);
		granaInt = granaInt % 20;

		System.out.printf("%d nota(s) de R$ 10.00\n", granaInt/10);
		granaInt = granaInt % 10;

		System.out.printf("%d nota(s) de R$ 5.00\n", granaInt/5);
		granaInt = granaInt % 5;

		System.out.printf("%d nota(s) de R$ 2.00\n", granaInt/2);
		granaInt = granaInt % 2;

		if (granaInt == 1){
			granaDec = granaDec + 100;
		}
		
		System.out.println("MOEDAS:");
		
		System.out.printf("%d moeda(s) de R$ 1.00\n", granaDec/100);
		granaDec = granaDec % 100;

		System.out.printf("%d moeda(s) de R$ 0.50\n", granaDec/50);
		granaDec = granaDec % 50;

		System.out.printf("%d moeda(s) de R$ 0.25\n", granaDec/25);
		granaDec = granaDec % 25;

		System.out.printf("%d moeda(s) de R$ 0.10\n", granaDec/10);
		granaDec = granaDec % 10;

		System.out.printf("%d moeda(s) de R$ 0.05\n", granaDec/5);
		granaDec = granaDec % 5;

		System.out.printf("%d moeda(s) de R$ 0.01\n", granaDec/1);
		granaDec = granaDec % 1;

		sc.close();
	}
}