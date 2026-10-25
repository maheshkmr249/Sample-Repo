package InterviewPrograms;
public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {10, 25, 45, 67, 89, 54};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > first) {
                second = first;
                first = num;
            }
            else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println("Largest Element: " + first);
        System.out.println("Second Largest Element: " + second);
    }
}