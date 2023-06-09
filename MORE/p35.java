import java.util.Scanner;
public class p35 {
  public static void main(String[] args) {
  
    Scanner on = new Scanner(System.in);
    int a = on.nextInt();
    int b = on.nextInt();
    int c = on.nextInt();
    int d = on.nextInt();
    
    if (b > c && d > a && (c+d) > (a+b) && c > 0 && d > 0 && (a%2==0)) 
    {
    System.out.println("Valores aceitos");
    }
    else {System.out.println("Valores nao aceitos");}
    
  }
}