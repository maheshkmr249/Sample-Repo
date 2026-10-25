 package JavaConcepts;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava(); 
		//obj is reference variable of an object and new FunctionsInJava() is an object
		//After creating the object, the copy of all non static methods will be given to this object
		//Main method is void, so it never returns a value
		obj.test();
		System.out.println(obj.pqr());
		System.out.println(obj.qa());
		System.out.println(obj.division(20,4));
		
//		int l = obj.pqr();
//		System.out.println(l);
//		String s = obj.qa();
//		System.out.println(s);
//		System.out.println(obj.division(20,4));
	}
	
	//Non static methods
	
	//Void doesnt return any value
	//return type = void
	public void test() //no ip, no op
	{
		System.out.println("test---method");
	}
	
	//retrun type = int
	public int pqr() { //no ip, some op
		
		System.out.println("pqr---method");
		
		int a=10;
		int b=20;
		int c=a+b;
	   //System.out.println(c);
		return c;
	}
	
	//return type --->string
	public String qa() { //no ip, some op
		System.out.println("qa method");
		String s = "selenium";
		//System.out.println(s);
		return s;
	}
	
	//return type --->int
	//x,y--ip parameters/arguments
	public int division(int x, int y) {
		System.out.println("division method");
		int d=x/y;
		//System.out.println(d);
		return d;
	}
}
