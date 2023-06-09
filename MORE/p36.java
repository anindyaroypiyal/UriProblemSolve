import java.util.Scanner;
public class p36 {
  public static void main(String[] args) {
  
    Scanner on = new Scanner(System.in);
    double a = on.nextDouble();
    double b = on.nextDouble();
    double c = on.nextDouble();
    
    double aa=(-b+(Math.sqrt(b*b-4*a*c)))/(2*a);
    double bb=(-b-(Math.sqrt(b*b-4*a*c)))/(2*a);
    
       if (2*a == 0 ||  (b*b-4*a*c) < 0 ) {System.out.println("Impossivel calcular");}
    else {
      System.out.printf("R1 = %.5f",aa );
    System.out.printf("\nR2 = %.5f",bb);}    
  }
}