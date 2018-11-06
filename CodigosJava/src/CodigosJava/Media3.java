import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
 
public class Main {
     
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
             
        float n1, n2, n3, n4, media;
        
        String num = in.readLine();
        String[] arrNum = num.split(" ");
        
        n1 = Float.parseFloat(arrNum[0]) * 2;
        n2 = Float.parseFloat(arrNum[1]) * 3;
        n3 = Float.parseFloat(arrNum[2]) * 4;
        n4 = Float.parseFloat(arrNum[3]);
        
        media = (n1+n2+n3+n4)/10;        
        System.out.printf("Media: %.1f\n", media);
        
        if (media >= 7.0) {
        	System.out.printf("Aluno aprovado.\n");
		} else if (media < 5.0) {
			System.out.printf("Aluno reprovado.\n");
		} else {
			System.out.printf("Aluno em exame.\n");
			float exame = Float.parseFloat(in.readLine());
			System.out.printf("Nota do exame: %.1f\n", exame);
			
			media = (media + exame)/2;
			
			if (media >= 5.0) {
	        	System.out.printf("Aluno aprovado.\n");
			} else {
				System.out.printf("Aluno reprovado.\n");
			}
			System.out.printf("Media final: %.1f\n", media);
			
		}
        
        
         
    }
     
}