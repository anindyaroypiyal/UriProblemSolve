import java.util.Scanner;

public class Triangletype {

	public static void main(String[] args) {
		Scanner  on = new Scanner(System.in);
		
		double []ary = new double[3];
		ary[0] = on.nextDouble();
		ary[1] = on.nextDouble();
		ary[2] = on.nextDouble();
		
		for(int i = 0 ; i < ary.length ; i++) {
			int mxIndx = i;
			for (int j = i+1 ; j < ary.length ; j++) {
				if(ary[j] > ary[mxIndx]) {
					mxIndx = j;
				}	
			}
			double temp = ary[mxIndx];
			ary[mxIndx] = ary[i];
			ary[i] = temp;
		}
		if(ary[0] >= ary[1]+ary[2] ) {
			System.out.println("NAO FORMA TRIANGULO");
		}else {
		if((ary[0] * ary[0])==(ary[1]*ary[1])+(ary[2]*ary[2])) {
			System.out.println("TRIANGULO RETANGULO");
		}
		if((ary[0] * ary[0]) > (ary[1]*ary[1])+(ary[2]*ary[2])) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		if((ary[0] * ary[0]) < (ary[1]*ary[1]) +(ary[2]*ary[2]) ) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if(ary[0] == ary[1] && ary[1] == ary[2]) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		if(ary[0] == ary[1] && ary[1] != ary[2]) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		if(ary[0] == ary[2] && ary[1] != ary[2]) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		if(ary[1] == ary[2] && ary[0] != ary[2]) {
			System.out.println("TRIANGULO ISOSCELES");
		}
	}
}
}