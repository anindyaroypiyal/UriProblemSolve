import java.util.Scanner;
public class t4 {
  public static void main(String[] args){
    Scanner on = new Scanner(System.in);
    
    System.out.println("Enter numbers");
    
    int a = on.nextInt();

    int b = on.nextInt();
    
    int PROD = (a*b);
    
    System.out.println("PROD = "+PROD);
  }
}