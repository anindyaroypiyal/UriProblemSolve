import java.util.Scanner;
import java.text.*;
public class p11{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.000");
    int R = on.nextInt();
    
    double vol = (4.0/3) * 3.14159 * (Math.pow(R,3));
    
    System.out.println("VOLUME = "+df.format(vol));
  }
}