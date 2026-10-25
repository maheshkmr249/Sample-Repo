package Sample_Programs;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		//it is similar to hashmap, but its synchronised
		//stores the value on the basis of key-value
		//key-->object--Hashcode--->value
		//It contains only unique values
		//It will not accepts null values
	Hashtable h1 = new Hashtable();
	h1.put(1, "Tom");
	h1.put(2,"Test");
	h1.put(3,"Java");
	
	//create a clone copy/shallow copy
	Hashtable h2 = new Hashtable();
	h2= (Hashtable)h1.clone();
	
	System.out.println("The values from h1 "+h1);
	System.out.println("The values from h2 "+h2);
	
	h1.clear();
	System.out.println("The values from h1 "+h1);
	System.out.println("The values from h2 "+h2);
	
	//contains value
	Hashtable st = new Hashtable();
	st.put("A", "Mahesh");
	st.put("B", "Ramesh");
	st.put("C","Rakesh");

	if(st.containsValue("Mahesh"))
		System.out.println("Value is found");
	
	//print all values from hashtable using -- Enumeration --elements()
	
	Enumeration e = st.elements();
	System.out.println("print values from st using enumeration");
	
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	
	//get all values from hashtable using entry set()-- set of hashtable values:
	System.out.println("print values from st using entry set");
	Set s = st.entrySet();
	System.out.println(s);
	
	Hashtable st1 = new Hashtable();
	st1.put("A", "Mahesh");
	st1.put("B", "Ramesh");
	st1.put("C","Rakesh");

	//check both the hash tables are equal or not
	if(st.equals(st1))
	{
		System.out.println("both are equal");
	}
	
	//get value from a key
	System.out.println(st1.get("A"));
	
	//get the hash code of the hashtable object
	System.out.println("The hashcode value of st1 is: "+st1.hashCode());
	} 
}
