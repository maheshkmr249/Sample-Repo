package Sample_Programs;

import java.util.LinkedHashSet;

public class RemoveDuplicatesUsingHashSet1 {

	public static void main(String[] args) {
		//int a[] = {5,2,6,8,6,7,5,2,8};
		String[] arr = {"Hello", "world", "selenium", "Hello", "Java"};
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		  
        // adding elements to LinkedHashSet
//        for (int i = 0; i < arr.length; i++)
//            set.add(arr[i]);
        
        for(String a: arr)
        {
        	set.add(a);
        }
  
        // Print the elements of LinkedHashSet
        System.out.println(set);
	}
}
