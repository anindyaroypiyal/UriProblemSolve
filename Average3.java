
import java.util.Scanner;

public class Average3 {

	public static void main(String[] args){
		Scanner on = new Scanner(System.in);
		
		
		float n1 = on.nextFloat();
		float n2 = on.nextFloat();
		float n3 = on.nextFloat();
		float n4 = on.nextFloat();
		float n5;
		
		float n = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
		
		System.out.printf("Media: %.1f\n",n);
		if(n >= 7.0) {
			System.out.println("Aluno aprovado.");
		}else if(n < 5.0) {
			System.out.println("Aluno reprovado.");
		}
		else if(n >= 5.0 && n <= 6.9) {
			System.out.println("Aluno em exame.");
			n5 = on.nextFloat();
			System.out.printf("Nota do exame: %.1f\n" ,n5);
			double s = (n+n5)/2;
			if(s >= 5.0) {
				System.out.println("Aluno aprovado.");
			}else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n",s);
		}
	}
	
	
}
