import java.util.Scanner;
public class p20 {
  public static void main(String[] args) {
  
    Scanner on = new Scanner(System.in);
    int a = on.nextInt();
     
    int year = a / 365;
    int x = a % 365;
    int month = x/30;
    int day = x % 30;
    
    System.out.println(year +" ano(s)\n" + month +" mes(es)\n" +day +" dia(s)");
   
  }
}