package AbstrationOOP;

public class Test extends Shape {
	
	Test(){
		
		System.out.println("Test class constructor");
	}

	public static void main(String[] args) {
		
		Shape s= new Test();
		s.drawing();
		s.fill();
		
//		Test test = new Test();
//		test.drawing();
		
		//Shape shape = new Shape();  //will not work(Downcasting)
		
		
	}

	@Override
	void drawing() {
		System.out.println("Drawing--method");
	}
}
