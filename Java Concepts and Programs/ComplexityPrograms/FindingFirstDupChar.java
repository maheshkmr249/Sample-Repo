package ComplexityPrograms;

import java.util.HashSet;

public class FindingFirstDupChar {

	public static void main(String[] args) {
		 String str = "programming";

	        HashSet<Character> set = new HashSet<>();

	        for (char ch : str.toCharArray()) {
	            if (!set.add(ch)) {
	                System.out.println("First duplicate: " + ch);
	                break;
	            }
	        }
	}
}
