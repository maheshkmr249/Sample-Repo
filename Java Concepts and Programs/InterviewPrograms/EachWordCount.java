package InterviewPrograms;

import java.util.HashMap;

public class EachWordCount {

	public static void main(String[] args) {
     String sentence = "I am am selenium automation test test engineer engineer engineer";
        
        String[] words = sentence.split(" ");
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String w : words) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }
        
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
	}
}
