package InterviewPrograms;

public class Prog1 {

	public static void main(String[] args) {
		    String str = "Functional testing";
	        
	        // Split the string into words
	        String[] words = str.split(" ");
	        System.out.println(words.length);
	        
	        // Print first character of each word
	        for (String w : words) {
	        	 
	        	 System.out.print(w.charAt(0));
	        	 
	      }        
	 }
}