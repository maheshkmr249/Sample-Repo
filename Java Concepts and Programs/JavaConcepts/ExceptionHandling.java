package JavaConcepts;

public class ExceptionHandling {
	//int a=10;

	public static void main(String[] args) throws InterruptedException {
		
		//uncaught exception
	//	int i=9/0;
	//	System.out.println(i);
		
		//caught exception
	//	Thread.sleep(2000);
		
	//	ExceptionHandling obj = new ExceptionHandling();
	//	obj=null;
	//	System.out.println(obj.a);  //null pointer exception
		
		//1. try- catch block
		
		try {
		int i=9/0; //this code will throw an exception
		}
		catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
	}
}
