package Sample_Programs;

public class SeperatingFromAlphaNumeric {

	public static void main(String[] args) {
		
		String AlphaNumeric = "Interview01@ Java234# Program567$";
		String Alphabets = "";
		String Numeric = "";
		String Special = "";
		
		for(int i=0; i<AlphaNumeric.length(); i++) {
			
			char ch = AlphaNumeric.charAt(i);
			System.out.print(ch);
			if(Character.isDigit(ch))
			{
				Numeric=Numeric+ch;
			}
			else if(Character.isAlphabetic(ch))
			{
				Alphabets=Alphabets+ch;
			}
			else 
			{
				Special = Special+ch;
			}
		}
		System.out.println();
		System.out.println("Numeric values are: "+Numeric);
		System.out.println("Alphabet values are: "+Alphabets);
		System.out.println("Special values are: "+Special);
	}
}
