import java.util.Scanner;
import java.text.*;
public class p10 {
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    
    int code1 = on.nextInt();
    int unit1 = on.nextInt();
    double price1 = on.nextDouble();
    
    int code2 = on.nextInt();
    int unit2 = on.nextInt();
    double price2 = on.nextDouble();
    
    double price = (unit1 * price1) + (unit2 * price2);
    
    System.out.println("VALOR A PAGAR: R$ "+df.format(price));
    
  }
}