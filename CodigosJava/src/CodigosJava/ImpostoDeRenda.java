import java.io.IOException;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {


		float renda = new Scanner(System.in).nextFloat();
		float imposto = 0f;

		if(renda <= 2000){
			imposto = 0;
		} else if(renda >2000 && renda <= 3000){
			imposto = (renda-2000f)*0.08f;
		}else if(renda >3000 && renda <= 4500){
			imposto = (renda - 3000f)*0.18f + (1000f*0.08f);
		}else if(renda >4500){
			imposto =  (renda - 4500f)*0.28f + (1500f*0.18f) + (1000f*0.08f);

		}

		System.out.printf((imposto == 0) ? "Isento\n" : "R$ %.2f\n",imposto);
		
	}
}