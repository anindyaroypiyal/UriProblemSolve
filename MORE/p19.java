import java.util.Scanner;
public class p19 {
  public static void main(String[] args) {
  
    Scanner on = new Scanner(System.in);
    int a = on.nextInt();
     
    int hour = a / 3600;
    int x = a % 3600;
    int min = x / 60;
    int second = x % 60;
    
    System.out.println(hour+":"+min+":"+second);
   
  }
}