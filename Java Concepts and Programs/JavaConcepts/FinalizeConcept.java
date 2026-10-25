 package JavaConcepts;

public class FinalizeConcept {

	public void finalize() {
		System.out.println("finalize method");
	}
	
	//finlize() is used for clean up process before the garbage collection
	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1=null;
		f2=null;
		
		System.gc(); 
	}
}
//final is a keyword
//finally is a block
//finalize is a method