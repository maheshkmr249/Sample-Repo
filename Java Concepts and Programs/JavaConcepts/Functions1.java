package JavaConcepts;


public class Functions1 {

	public void test()
	{
	System.out.println("test method");
	}

	public int add()
	{
	System.out.println("add method");
	int a = 10;
	int b = 20;
	int c = a+b;
	return c;
	}

	public String empName()
	{
	System.out.println("String method");
	String s = "Mahesh";
	return s;
	}
	
	public static int sub() {
	System.out.println("subtraction method");	
	int a=30;
	int b=20;
	int c=a-b;
	return c;
	}

	public static void main(String[] args){
	Functions1 obj = new Functions1();
	obj.test();
	System.out.println(obj.add());
	System.out.println(obj.empName());
	System.out.println(Functions1.sub());
	}
}
