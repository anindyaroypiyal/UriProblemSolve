import java.util.Scanner;
import java.text.*;
public class p14 {
  public static void main(String[] args) {
  
    Scanner on = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.000");
    int X = on.nextInt();
    double Y = on.nextDouble();
    
    double con = X / Y;
    
    System.out.println(df.format(con) +" km/l");
  
  }
}