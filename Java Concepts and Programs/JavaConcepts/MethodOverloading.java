package JavaConcepts;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10.0);
		obj.sum(20,30);

	}
	
	/*public static void main(int p) {
	
	}
	
	public static void main(int q, int h) {
		
	}*/
	
	//Method overloading-- when the method name is same with the different arguments or input parameters within the same class
	//We can overload main()
	public void sum() {
	System.out.println("Sum method--zero param");	
	}
	
	public void sum(int i) {
	System.out.println("Sum method--one param");
	System.out.println(i);
	}
	
	public void sum(double l) {
		System.out.println("Sum method--one param");
		System.out.println(l);
		}

	public void sum(int i, int j) {
	System.out.println("Sum method--two param");
	System.out.println(i+j);
	
	}
}
