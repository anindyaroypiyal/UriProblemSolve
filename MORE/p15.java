import java.util.Scanner;
import java.text.*;
public class p15 {
  public static void main(String[] args) {
  
    Scanner on = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.0000");
    double x1 = on.nextDouble();
    double y1 = on.nextDouble();
    double x2 = on.nextDouble();
    double y2 = on.nextDouble();
    
    double x = Math.pow((x2 - x1),2);
    double y = Math.pow((y2 - y1),2);
    double dis = Math.pow((x + y),0.5);
    
    System.out.println(df.format(dis));
  }
}