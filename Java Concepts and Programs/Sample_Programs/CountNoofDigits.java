
package Sample_Programs;

public class CountNoofDigits {

	public static void main(String[] args) {
		int num = 1234568;
		int count = 0;
		
		while(num>0)  
		{
		num = num/10;
		count++;
		}
        System.out.println("No of digits: " +count);
	}
}
