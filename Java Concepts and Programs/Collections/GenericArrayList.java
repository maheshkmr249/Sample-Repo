package Collections;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> markList = new ArrayList<Integer>();
		markList.add(100);
		System.out.println(markList);
		
		ArrayList<Double> arD = new ArrayList<Double>();
		arD.add(12.33);
		arD.add(8.0);
		
		ArrayList<String> studentName = new ArrayList<String>();
		studentName.add("Mahesh");
	}
}
