package Practice;

public class Charcount {

	public static void main(String[] args) {
		String s = "maheshkumar";
		int count=0;
		for(int i=0; i<s.length();i++)
		{
		if(s.charAt(i) == 'r')
		{
		count++;
		}
		}
		System.out.println("Charecter occurence in our string is: "+count);
	}
}
