package InterviewPrograms;

import java.util.HashMap;

public class WordCountinStringArray {

	public static void main(String[] args) {
      
		String[] words  = {"Hello", "Java", "Hello", "Testing", "Hello", "Dotnet"};
        
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
