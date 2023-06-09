import java.util.Scanner;
import java.text.*;
public class pr5 {
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00000");
    
    double i= on.nextDouble();
    double j= on.nextDouble();
    
    if (i <= 10 && j <= 10) { if (i >= 0 && j >= 0 ) {
    double avg = (i+j)/2 ;
    
     System.out.println("MEDIA = "+df.format(avg));
    }
   }
  }
}