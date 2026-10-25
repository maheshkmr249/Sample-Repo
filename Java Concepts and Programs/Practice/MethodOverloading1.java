package Practice;

public class MethodOverloading1 {

	public void sum()
	{
	System.out.println("sum method with zero param");
	}

	public void sum(int a)
	{
	System.out.println("sum method with single param");
	System.out.println(a);
	}
	public void sum(int a, int b)
	{
	System.out.println("sum method with 2 params");
	System.out.println(a+b);
	}


	public static void main(String args[])
	{
	MethodOverloading1 obj = new MethodOverloading1();
	obj.sum();
	obj.sum(10);
	obj.sum(20,30);
	}
}
