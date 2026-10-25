package ComplexityPrograms;

public class FindingDupInStringArray1 {

	public static void main(String[] args) {
		String[] arr = {"apple", "banana", "orange", "apple", "mango", "banana"};

        System.out.print("Duplicates: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
	}
}
