import java.util.Scanner;
public class p12 {
  public static void main(String[] args) {
  
    Scanner on = new Scanner(System.in);
    double A = on.nextDouble();
    double B = on.nextDouble();
    double C = on.nextDouble();
    
   double triangle = 0.5 * A * C;
   double circle = 3.14159 * C* C;
   double trapezium = 0.5 * (A + B) * C;
   double square = B*B;
   double rectangle = A * B;
   
   System.out.printf("TRIANGULO: %.3f\n", triangle);
   System.out.printf("CIRCULO: %.3f\n", circle);
   System.out.printf("TRAPEZIO: %.3f\n", trapezium);
   System.out.printf("QUADRADO: %.3f\n", square);
   System.out.printf("RETANGULO: %.3f\n", rectangle);
  }
}               