package InterviewPrograms;

import java.util.HashMap;

public class EachDigitCount {

	public static void main(String[] args) {
		String name = "12345123";
		HashMap<Character, Integer> Map = new HashMap<Character, Integer>();
		char chArray[] = name.toCharArray();
		
		for(char c : chArray) {
		if(Map.containsKey(c))
		{
			Map.put(c, Map.get(c) + 1);
		}
		else {
			Map.put(c,1);
		}

	}
	
	System.out.println(name + " : " +Map);

	}

}
