import java.util.Scanner;
public class p13{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    int a = on.nextInt();
    int max = a ;
    for(int j = 1 ; j< 3 ; j++){
    
      int b = on.nextInt();
    
      if(b>max){max = b;}
    
    }
    System.out.println(max +" eh o maior");
  }
}