package Sample_Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		//No order-- no indexing
		//stores values--key,valu---<k,v>
		//key cannot be duplicate
		//Can store n number of null values but only one null key
		//hash map is not synchronized that means it can access multiple threads at same time-->not thread safe
		 
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Wasington DC");
		capitalMap.put("UK", "London");
		
		System.out.println(capitalMap);
		
		System.out.println("-------------");
		//Iterator over the keys: by using keySet()
		Iterator <String> it = capitalMap.keySet().iterator();
		
		while(it.hasNext()) {
		String key = it.next();
		String value = capitalMap.get(key);
		System.out.println("key= "+key + " value= "+value);
		
		}
		
		System.out.println("-------------");
		
		//iterator over set (pair): by using entrySet
		
		Iterator<Entry<String, String>> it1= capitalMap.entrySet().iterator();
		
		while(it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			System.out.println("key= " + entry.getKey() + " and value = " + entry.getValue());
		}
		
		System.out.println("------------");
		//iterator hashmap using java 8 for each and lambda:
		//capitalMap.forEach(k,v) -> System.out.println("key = " + k + " and value = " + v);
		
	}
}
