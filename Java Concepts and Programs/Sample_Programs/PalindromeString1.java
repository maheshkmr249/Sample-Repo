package Sample_Programs;

public class PalindromeString1 {

	public static void main(String[] args) {
		
		String str = "MAAM";
		//String org_str = str;
		String rev = "";
		
		//int length = str.length();
		
		for(int i=str.length()-1; i>=0; i--) {
			
			rev = rev+str.charAt(i);
			
		}
		System.out.println(rev);
		
		if(str.equals(rev)) {
			
			System.out.println("Entered String is palindrome");
		}
		else {
			System.out.println("Entered String is not a palindrome");
		}
	}
}
