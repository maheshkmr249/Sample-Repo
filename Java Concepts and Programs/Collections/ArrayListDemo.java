package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//default class
		//dynamic array
		
		//default generics
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);//0
		ar.add(200);//1
		ar.add("testing");//2
		ar.add('t');//3
		ar.add(12.33);//4
		ar.add(true);//5
		
		System.out.println(ar);
		
		System.out.println(ar.get(2));
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		System.out.println(ar);
		System.out.println(ar.size());
		
		//List with other collections
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		
		System.out.println(numbers);
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Java", "Python", "C++"));
		
		System.out.println(names );
	}
}
