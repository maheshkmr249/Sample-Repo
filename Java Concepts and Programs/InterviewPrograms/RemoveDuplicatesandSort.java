package InterviewPrograms;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesandSort {

	public static void main(String[] args) {
		int[] arr = {5, 2, 6, 8, 6, 7, 5, 2, 8};

        Set<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set);
	}
}
