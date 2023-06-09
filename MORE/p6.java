import java.util.Scanner;
public class p6 {
  public static void main(String[] args) {
  
    Scanner on = new Scanner(System.in);
    double a = on.nextDouble();
    double b = on.nextDouble();
    double c = on.nextDouble();
    
    double avg = (a*2 + b*3 + c*5)/(10);
    
    System.out.printf("MEDIA = %.1f\n", avg);
  }
}