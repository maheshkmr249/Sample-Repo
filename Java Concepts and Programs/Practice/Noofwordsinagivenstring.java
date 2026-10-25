package Practice;

public class Noofwordsinagivenstring {

	public static void main(String[] args) {
		String s = "Hello Welcome to java sessions";
		int count=1;

		for(int i=0; i<s.length(); i++)
		{
		if((s.charAt(i)== ' ') && (s.charAt(i+1)!= ' '))
		{
		count++;
		}
		}
		System.out.println("no of words in the given string are: "+count);

	}
}
