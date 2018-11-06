import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args){
 		
    	verifica(new Scanner(System.in).nextFloat());

    }
    public static void verifica(float valor){

    	if(valor < 0f || valor > 100f)
    		System.out.println("Fora de intervalo");

    	else if(valor >= 0f && valor <= 25f)
	    	System.out.println("Intervalo [0,25]");

	    else if(valor >= 25f && valor <= 50f)
	    	System.out.println("Intervalo (25,50]");

	    else if(valor >= 50f && valor <= 75f)
	    	System.out.println("Intervalo (50,75]");

	    else if(valor >= 75f && valor <= 100f)
	    	System.out.println("Intervalo (75,100]");		
	    }
 
}