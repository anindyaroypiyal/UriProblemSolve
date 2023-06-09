import java.util.Scanner;
import java.text.*;
public class pr2 {
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.0000");
    double r= on.nextDouble();
    
    double area = 3.14159 * (r*r) ;
    
     System.out.println("A="+df.format(area));
  
  }
}