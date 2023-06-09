import java.util.Scanner;
public class p7 {
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    int A = on.nextInt();
    int B = on.nextInt();
    int C = on.nextInt();
    int D = on.nextInt();
  
   int dif = A*B - C*D;
   
   System.out.println("DIFERENCA = "+dif);
  }
}