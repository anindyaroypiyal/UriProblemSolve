import java.util.Scanner;
public class p5 {
  public static void main(String[] args) {
  
    Scanner on = new Scanner(System.in);
    double a = on.nextDouble();
    double b = on.nextDouble();
    
    double avg = (a*3.5 + b*7.5)/(3.5+7.5);
    
    System.out.printf("MEDIA = %.5f\n", avg);
  }
}