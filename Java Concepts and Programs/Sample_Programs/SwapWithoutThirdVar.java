package Sample_Programs;

import java.util.Scanner;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
	  	System.out.println("Enter the two numbers");
		a = sc.nextInt();
		b = sc.nextInt();		
		System.out.println("The values before swap");
   	 	System.out.println("a = "+a+" b = "+b);	
		
		a=a-b;
		b=a+b;
		a=b-a;
	
		//Can use this also
		/*a=a+b;		
		b=a-b;
		a=a-b;*/
	
		System.out.println("The values after swap");
   	 	System.out.println("a = "+a+" b = "+b);	
	}
}
