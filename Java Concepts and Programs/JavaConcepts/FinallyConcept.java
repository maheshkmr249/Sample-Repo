package JavaConcepts;

public class FinallyConcept {
	//finally blcok will executes the program even after the catch block works/doesnt works to catch the error/exception
	public static void main(String[] args) {
		//test1();
		//test2();
		div();
	}
	
	public static void test1() {
		try {
			System.out.println("Inside test1 method");
			throw new RuntimeException("test");
		}
		catch(Exception e) {
			System.out.println("Inside catch block");
		}
		
		finally
		{
			System.out.println("inside finally block");
		}
	}	
		public static void test2() {
			try {
				System.out.println("inside test2");
			}
			finally {
				System.out.println("finally code in test2");
			}
		}
		
		public static void div() {
			int i=10;
			try {
				System.out.println("inside try block");
				int k=i/0;
			}
			catch(NullPointerException e) {
				System.out.println("Inside catch block");
				System.out.println("divide by zero error");
			}
			
			finally {
				System.out.println("execute this code even after any exception");
			}
		}
	}

