package Sample_Programs;

public class CountCharecterOcuurenceinString {

	public static void main(String[] args) {
		
		String s= "Java Programming Java oops";
		
		int totalcount=s.length();
		System.out.println(totalcount);
        int totalcount_afterRemove= s.replace("a","").length();
        System.out.println(totalcount_afterRemove);
        int count=totalcount-totalcount_afterRemove; 
        System.out.println("No of occurences of charecter is: "+count);
	}
}
