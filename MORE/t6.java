import java.util.Scanner;
public class t6{
  public static void main(String[] args){
    
  Scanner on= new Scanner(System.in);
  int S = on.nextInt();
  int L;
   
  if (S < 100) {
   L = 3000-125*(S*S);
  }
    else {L= 4+((S*S)/14900);}
    
    System.out.println("L = "+L);
  
  }
}
