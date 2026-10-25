package ComplexityPrograms;

import java.util.HashSet;

public class FindingDupInStringArray {

	public static void main(String[] args) {
		  String[] arr = {"apple", "banana", "orange", "apple", "mango", "banana"};

	        HashSet<String> seen = new HashSet<>();
	        HashSet<String> duplicates = new HashSet<>();

	        for (String str : arr) {
	            if (!seen.add(str)) {
	                duplicates.add(str);
	            }
	        }

	        System.out.println("Duplicates: " + duplicates);

	}

}
