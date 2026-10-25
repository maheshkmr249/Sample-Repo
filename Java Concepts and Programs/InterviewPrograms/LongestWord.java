package InterviewPrograms;
public class LongestWord {
    public static void main(String[] args) {
        String str = "Java streams are powerful and Java streams are elegant";

        String[] words = str.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);
    }
}