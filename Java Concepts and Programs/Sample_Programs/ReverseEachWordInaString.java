package Sample_Programs;

public class ReverseEachWordInaString {

	public static void main(String[] args) {
		
	/*	//Approach 1
		String str = "Welcome to Java";
		String[] words = str.split(" ");//splitting string into words
		String reverseString="";
		
		for(String w:words)  //java  
		{	
			String reverseword=""; 
		
	   for(int i=w.length()-1; i>=0; i--)
	   {
		   reverseword=reverseword+w.charAt(i);
	   }
        reverseString=reverseString+reverseword+" "; //emocleW oT avaJ
	   }
   System.out.println(reverseString);*/
   
		
	//Approach 2 using built in method	
		
	String str="Welcome To Selenium";
	String[] words=str.split(" ");
	
	String reverseword="";
	
	for(String w:words)//Java
	{
		StringBuilder sb = new StringBuilder(w);
	    sb.reverse();  //avaJ
	    
	    reverseword=reverseword+sb.toString()+" ";
	}
	System.out.println(reverseword);
	}
}