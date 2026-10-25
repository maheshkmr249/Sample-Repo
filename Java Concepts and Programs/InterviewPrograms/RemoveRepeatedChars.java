package InterviewPrograms;

import java.util.LinkedHashSet;

public class RemoveRepeatedChars {

	public static void main(String[] args) {
		 String input = "annuuujjjjj";
	        
	        LinkedHashSet<Character> set = new LinkedHashSet<>();

	        for (char c : input.toCharArray()) {
	            set.add(c);
	        }
//        System.out.println(set);
	        for (char c : set) {
	            System.out.print(c);
	        }
	 }
}
