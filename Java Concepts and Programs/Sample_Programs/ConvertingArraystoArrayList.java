package Sample_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertingArraystoArrayList {

	public static void main(String[] args) {
		{
	        String[] geeks = {"Rahul", "Utkarsh", "Shubham", "Neelam"};
	  
	      // Conversion of array to ArrayList
	      // using Arrays.asList
	      //List<String> al = Arrays.asList(geeks);
	      //System.out.println(al);
	        
	     // Adding some more values to the List.
	     // List<String> al = new ArrayList<String>(Arrays.asList(geeks));
	     // System.out.println(al);
	     // al.add("Shashank");
	     // al.add("Nishant");
	  
	     // System.out.println("\nArrayList After adding two more Geeks: ");
	     // System.out.println(al);
	        
	        List<String> al = new ArrayList<String>();
	      
	        // adding elements of array to arrayList.
	        Collections.addAll(al, geeks);
	        System.out.println(al);
	   }
	}
}
