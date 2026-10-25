package InterviewPrograms;

import java.util.HashSet;

public class PrintMissingNumbers {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5};

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        for (int i = 1; i <= 5; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
	}
}
