package Sample_Programs;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		int org_num=num;

		int rev = 0;

		while(num!=0)
		{
		rev=rev*10 + num%10; //0+5 //50+4=54 //540+3=543
		num = num/10;
		}
		
		if(org_num==rev) 
		{
			System.out.println(org_num+" is Palindrome number");
		}
		else
		{
			System.out.println(org_num+" Not a Palindrome number");
		}
	}
}
