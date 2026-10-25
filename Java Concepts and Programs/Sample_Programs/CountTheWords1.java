package Sample_Programs;

public class CountTheWords1 {

	public static void main(String[] args) {
		String str = "Welcome to Selenium Training tutorials";
		//System.out.println(str.length());
//		int count = 1;
//		for(int i=0; i<str.length(); i++)
//		{
//		if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
//		{
//		count++;
//		}
//		}
//		 System.out.println("No of words in a string is:" +count);
		String[] words = str.split(" ");
		System.out.println(words.length);
    }
}
