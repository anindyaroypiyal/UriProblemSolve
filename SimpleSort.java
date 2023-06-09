import java.util.Scanner;

public class SimpleSort {

	public static void main(String[] args) {
		Scanner on = new Scanner(System.in);
		
		int []arr = new int[3]; 
		
		int a = on.nextInt();
		int b = on.nextInt();
		int c = on.nextInt();
		
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
	for (int i = 0 ;i < arr.length ; i++) {
		int minIndx = i;
		for(int j = i+1 ; j < arr.length ; j++) {
		if(arr[j] < arr[minIndx]) {
			minIndx = j;
		}
		}
		int temp = arr[minIndx];
		arr[minIndx] = arr[i];
		arr[i] = temp;
	}
	
	for (int i = 0 ; i < arr.length ; i++) {
		System.out.println(arr[i]);
	}
	
	System.out.println();
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
}