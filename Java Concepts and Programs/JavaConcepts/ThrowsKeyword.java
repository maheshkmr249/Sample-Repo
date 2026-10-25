package JavaConcepts;

//The purpose of throws keyword is to handle the exceptions
//super class of error and exception is throwable
//super class of throwable is object
public class ThrowsKeyword { //Drawback of throws keyword is it will not execute the remaining lines of code from where the exception occured

	public static void main(String[] args)  throws ArithmeticException{ //main() catching the error as it is calling the sum() and finally it handles by JVM
		
		ThrowsKeyword obj = new ThrowsKeyword(); 
		obj.sum();
	}
	
	public void sum() throws ArithmeticException { //sum() is catching that error as it is calling the div() 
		div();
		System.out.println("sum()");
	}
	
	public void div() throws ArithmeticException { //div() throwing the error
		int i = 9/0;  //exception line
		System.out.println("div()");
	}
}
