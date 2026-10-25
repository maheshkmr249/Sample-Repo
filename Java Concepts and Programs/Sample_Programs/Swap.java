package Sample_Programs;

public class Swap {
	public static void main(String[] args){
		int a = 20, b=30;

		System.out.println("Before Swap the value of a is:" +a);
		System.out.println("Before Swap the value of b is:" +b);

		int temp = a;
		a=b;
		b=temp;


		System.out.println("After Swap the value of a is:" +a);
		System.out.println("After Swap the value of b is:" +b);
	}
}
