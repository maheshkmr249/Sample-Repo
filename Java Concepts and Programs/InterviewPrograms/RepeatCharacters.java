package InterviewPrograms;

public class RepeatCharacters {

	public static void main(String[] args) {
		
		String str = "Anuj";
		 for (int i = 0; i < str.length(); i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print(str.charAt(i));
	            }
	     }
	}
}
