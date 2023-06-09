import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner on = new Scanner (System.in);
		
		int A = on.nextInt();
		int B = on.nextInt();
		
		if (B % A != 0) {
			System.out.println("Nao sao Multiplos");
		}
		else {
			System.out.println("Sao Multiplos");
		}
	}
}