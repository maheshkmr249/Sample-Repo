package Sample_Programs;

public class ReverseWordsOrder {

	 public static String reverseWords(String s) {
	        // Split the string into words using one or more whitespace characters as delimiter.
	        // The regex "\\s+" handles multiple spaces, tabs, etc., and removes empty strings from the result.
	        String[] words = s.trim().split("\\s+");
	        
	        // Use StringBuilder for efficient string concatenation, as String is immutable.
	        StringBuilder reversedString = new StringBuilder();
	        
	        // Iterate through the words array in reverse order.
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversedString.append(words[i]);
	            // Append a single space between words (except for the last word, handled by loop condition).
	            if (i > 0) {
	                reversedString.append(" ");
	            }
	        }
	        
	        return reversedString.toString();
	    }

	    public static void main(String[] args) {
	        String input1 = "the sky is blue";
	        System.out.println("Original: \"" + input1 + "\"");
	        System.out.println("Reversed: \"" + reverseWords(input1) + "\"");
	        
	        String input2 = "  hello  world  ";
	        System.out.println("Original: \"" + input2 + "\"");
	        System.out.println("Reversed: \"" + reverseWords(input2) + "\"");

	        String input3 = "a good   example";
	        System.out.println("Original: \"" + input3 + "\"");
	        System.out.println("Reversed: \"" + reverseWords(input3) + "\"");
	    }
}
