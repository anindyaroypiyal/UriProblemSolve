import java.util.Scanner;
public class t38{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    int x = on.nextInt();
    int y = on.nextInt();
    double value;
    
    if (x == 1) {value = 4; double total = value * y ;
    System.out.printf("Total: R$ %.2f\n"+total);}
    else {if (x == 2) {value = 4.50; double total = value * y ;
    System.out.printf("Total: R$ %.2f\n", total);}
      else { if (x == 3) {value  = 5; double total = value * y ;
    System.out.printf("Total: R$ %.2f\n"+total);}
        else { if (x == 4 ) {value = 2; double total = value * y ;
    System.out.printf("Total: R$ %.2f\n"+total);}
          else { if (x == 5 ) {value = 1.50; double total = value * y ;
    System.out.printf("Total: R$ %.2f\n"+total);}
          }
        }
      }
   }
    
  }
}