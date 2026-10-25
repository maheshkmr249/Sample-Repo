package Sample_Programs;

public class RemoveSpecifichar1 {

	public static void main(String[] args) {
		 String str = "India is my country";  
	         
	      String a=  str.substring(0, 7); 
	      String b=  str.substring(8);
	      System.out.println(a);
	      System.out.println(b);
	      a=a+b;
	      System.out.println(a);

	}
}
