package Practice;

import java.util.HashSet;

public class FindingDuplicateUsingHashset {

	public static void main(String[] args) {
		
       String arr[] = {"java", "C", "C++", "python", "java", "python"};
		
		HashSet <String> hs = new HashSet<String>();
		
		boolean flag=false;
		for(String l:arr)
		{
			//System.out.println(l);
			if(hs.add(l)==false)
			{
				System.out.println("Found Duplicate Element: "+l);
				flag=true;
			}
		}
     
		if(flag==false)
		{
			System.out.println("Not found Duplicate Element");
		}
	}
}
