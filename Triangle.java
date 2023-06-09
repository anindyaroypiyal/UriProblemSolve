import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner on = new Scanner (System.in);
		
		float a = on.nextFloat();
		float b = on.nextFloat();
		float c = on.nextFloat();
		int f = 0; 
		
		if (a+b > c) {
			if (b+c > a) {
				if(c+a > b) {
					
					System.out.printf("Perimetro = %.1f\n",(a+b+c));
					f=1;
				}
			}
		}
		if(f == 0) {
		float area = ((a+b)*c)/2;
		System.out.printf("Area = %.1f\n",area);
		}
	}
}
