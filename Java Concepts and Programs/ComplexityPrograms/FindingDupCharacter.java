package ComplexityPrograms;

import java.util.HashSet;

public class FindingDupCharacter {

	public static void main(String[] args) {
	    String str = "programming";

        HashSet<Character> seen = new HashSet<>();
        HashSet<Character> duplicates = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!seen.add(ch)) {
                duplicates.add(ch);
            }
        }

        System.out.println("Duplicate characters: " + duplicates);

	}

}
