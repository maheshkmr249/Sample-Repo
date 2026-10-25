package JavaConcepts;


public class ConstructorConcept {

	// We can overload constructor same as method overloading
		//Class vars: instance variables
		String name;
		int age;
		
		//0 param constructor
		public ConstructorConcept() {
			System.out.println("Default constructor");
		}
		
		//1 param constructor
		public ConstructorConcept(int i) {
			System.out.println("1 param constructor");
			System.out.println(i);
		}
		
		//2 param constructor
		
		public ConstructorConcept(int i, int j) {
			System.out.println("2 params constructor");
			System.out.println(i+" "+j);
		}
		
		public ConstructorConcept(String name, int age) {
			this.name = name;//this.classvar = local var
			this.age = age;//this.classvar = local var
			//whithout using this keyword we can declare like below
			//name = name1;
			//age= age1;
		}

		
		public static void main(String[] args) {
			ConstructorConcept obj = new ConstructorConcept(); 
			ConstructorConcept obj1 = new ConstructorConcept(10);
			ConstructorConcept obj2 = new ConstructorConcept(10,20);
			ConstructorConcept obj3 = new ConstructorConcept("Tom", 25);
			ConstructorConcept obj4 = new ConstructorConcept("Ramesh", 25);
			
			System.out.println(obj3.name);
			System.out.println(obj3.age);
			System.out.println(obj4.name);
			System.out.println(obj4.age);

		}
}
