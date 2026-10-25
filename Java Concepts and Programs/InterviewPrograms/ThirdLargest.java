package InterviewPrograms;
public class ThirdLargest {
    public static void main(String[] args) {

        int[] arr = {10, 25, 45, 67, 89, 54};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > first) {
                third = second;
                second = first;
                first = num;
            }
            else if (num > second && num != first) {
                third = second;
                second = num;
            }
            else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        System.out.println("Largest Element: " + first);
        System.out.println("Second Largest Element: " + second);
        System.out.println("Third Largest Element: " + third);
    }
}