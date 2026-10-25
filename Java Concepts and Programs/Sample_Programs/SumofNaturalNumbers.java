package Sample_Programs;

public class SumofNaturalNumbers {
	public static void main(String[] args){
		int num = 10, sum=0;
		for(int i=1; i<=num; ++i)
		{
		sum = sum+i;
		//sum += i;
		}
		System.out.println("sum = " +sum);
	}
}
