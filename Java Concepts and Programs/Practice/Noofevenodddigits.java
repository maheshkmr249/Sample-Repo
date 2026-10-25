package Practice;

public class Noofevenodddigits {

	public static void main(String[] args) {
		int num = 453453;
		int even_count=0;
		int odd_count=0;

		while(num>0)
		{
		int rem=num%10;

		if(rem%2==0)
		{
		even_count++;
		}

		else
		{
		odd_count++;
		}
		num = num/10;
		}
		System.out.println("no of even nos are: "+even_count);
		System.out.println("no of odd nos are: "+odd_count);

	}

}
