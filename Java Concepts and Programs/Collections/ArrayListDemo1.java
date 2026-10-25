package Collections;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
	
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("mahesh");
		al.add(2.5);
		al.add(5);
		al.add('c');
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(3));
		al.add("Ramesh");
		al.add("Ramesh");
		System.out.println(al);
		
		System.out.println("Using for loop");
		for(int i=0; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("Using for each loop");
		for(Object o:al)
		{
			
		System.out.println(o);	
		}	
			
		ArrayList<String> als = new ArrayList<String>();
		als.add("Ramesh");
		als.add("Rakesh");
		als.add("Rajesh");
		als.add("Rakesh");
		System.out.println(als);
		for(int i=0; i<als.size();i++)
		{
			System.out.println(als.get(i));
		}
	}
}