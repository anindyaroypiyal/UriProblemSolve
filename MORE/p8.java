import java.util.Scanner;
import java.text.*;
public class p8{
  public static void main(String[] args){
  
  Scanner on = new Scanner(System.in);
  DecimalFormat df = new DecimalFormat("0.00");
  int num = on.nextInt();
  int work = on.nextInt();
  double pw = on.nextDouble();
  
  double salary = pw*work;
  
  System.out.println("NUMBER = "+num);
  System.out.println("SALARY = U$ "+df.format(salary));
    
  }
}