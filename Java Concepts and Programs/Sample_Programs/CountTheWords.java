package Sample_Programs;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		 
		Scanner sc = new Scanner(System.in);
		
		String s=sc.nextLine();
		
		int count=1;
		
		for(int i=0; i<s.length(); i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("No of Words in a String: "+count); 
	}
}
