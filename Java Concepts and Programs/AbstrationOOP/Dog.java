package AbstrationOOP;

public class Dog extends Animal {

	public static void main(String[] args) {
		
		Dog d= new Dog();
		d.eat();

		//Dog d = new Animal(); //will not work(Downcasting)
		Animal a = new Dog();
  }
}
