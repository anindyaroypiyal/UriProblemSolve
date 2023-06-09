import java.util.Scanner;

public class gameTime {

	public static void main(String[] args) {
		Scanner on = new Scanner (System.in);
		
		int A = on.nextInt();
		int B = on.nextInt();
		int i , x;
		for(i = 0,x = A ; i < 24 ; i++) {
			x++;
			if(x > 23) {
				x = 0;
				
			}
			if(x == B) {
				break;
			}
		}
		System.out.println("O JOGO DUROU " +(i+1) +" HORA(S)");
	}
}	