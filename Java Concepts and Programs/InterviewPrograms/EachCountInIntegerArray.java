package InterviewPrograms;

import java.util.HashMap;

public class EachCountInIntegerArray {

	public static void main(String[] args) {
		
     int[] words = {1,2,2,3,5,4,7,7};
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (Integer w : words) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }
        
        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
	}
}
