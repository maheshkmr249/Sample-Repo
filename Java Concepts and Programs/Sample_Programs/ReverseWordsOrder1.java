package Sample_Programs;

public class ReverseWordsOrder1 {

	public static void main(String[] args) {
		
		String s = "Hello World Java";
		String[] words = s.split(" ");
//		System.out.println(words.length);
        
        // Use StringBuilder for efficient string concatenation, as String is immutable.
        StringBuilder sb = new StringBuilder();
          
        // Iterate through the words array in reverse order.
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            // Append a single space between words (except for the last word, handled by loop condition).
            sb.append(" ");
          
        }
        System.out.println(sb);
	}    
}
