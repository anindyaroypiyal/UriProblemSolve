import java.util.Scanner;

public class Snack {

	public static void main(String[] args) {
		Scanner on = new Scanner(System.in);
		
		int x = on.nextInt();
		int y = on.nextInt();
		double z = 0.00;
		
		if(x == 1) {
		  z = 4.00; 	
		}
		else if(x == 2) {
			z = 4.50;
		}
		else if(x == 3) {
			z = 5.00;
		}
		else if (x == 4) {
			z = 2.00;
		}
		else if(x == 5) {
			z = 1.50;
		}
		 double a = z*y;
		System.out.printf("Total: R$ %.2f ",a );
	}
}
