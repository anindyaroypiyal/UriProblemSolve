import java.util.Scanner;
import java.text.*;
public class p9{
  public static void main(String[] args){
  
    Scanner on= new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    String a = on.nextLine();
    double salary = on.nextDouble();
    double sold = on.nextDouble();
    
    double total = salary + (sold * 0.15);
    
    System.out.println("TOTAL = R$ "+df.format(total));
  }
}