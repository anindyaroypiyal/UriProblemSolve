import java.util.Scanner;
public class p17 {
  public static void main(String[] args) {
  
    Scanner on = new Scanner(System.in);
    int a = on.nextInt();
    int b = on.nextInt();
    
    double fuel = (a*b)/12.00;
    
    System.out.printf("%.3f\n",fuel);
   
  }
}