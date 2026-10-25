package InterviewPrograms;
import java.util.LinkedHashSet;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String sentence = "India is my country and India is largest country";

        String[] words = sentence.split(" ");
        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (String w : words) {
            set.add(w);
        }
        
        for (String w : set) {
            System.out.print(w+" ");
        }

        // Join words back into a sentence
//        String result = String.join(" ", set);

//        System.out.println("Original: " + sentence);
//        System.out.println("After removing duplicates: "+w);
    }
}