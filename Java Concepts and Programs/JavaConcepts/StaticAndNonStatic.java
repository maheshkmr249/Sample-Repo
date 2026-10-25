package JavaConcepts;

public class StaticAndNonStatic {

	//The scope of global variable will be available across all the functions with some conditions
	String name = "Tom"; //Non static global variable
	static int age = 25; //Static global variable
	
    public void sendMail() {//non static method
		
		System.out.println("send mail method");
	}
	
	public static void sum() {
		
		System.out.println("Sum method");
	}
	public static void main(String[] args) {
		
		//how to call static methods and variables
		//1. direct calling
		sum();
		
		//2. Calling by classname
		StaticAndNonStatic.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		
		//creating an object to access not static method sendMail()
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can i access static methods by using object reference? yes but it show a warning
		//obj.sum();
	}
	
	
}
