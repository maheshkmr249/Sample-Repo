package Sample_Programs;

import java.util.HashSet;

public class FindingDuplicateElementofStringArray {

	public static void main(String[] args) {
		/*String arr[]= {"java", "C", "C++", "Python", "java"};
		
		//Approach1
		
		boolean flag = false;
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]== arr[j])
				{
                 System.out.println("Found Duplicate Element: "+arr[i]);
			     flag = true;
			    }
		    }
	    }
	
	if(flag == false)
	{
		System.out.println("Duplicate Element not found");
	}
	*/
	//Approach 2 using hash set
		
		String arr[] = {"java", "C", "C++", "python", "java", "python"};
		
		HashSet <String> langs = new HashSet<String>(); 
		
	/*	System.out.println(langs.add("java"));
		System.out.println(langs.add("python"));
		System.out.println(langs.add("java"));
		System.out.println(langs.add("python"));
		System.out.println(langs); */
		boolean flag=false;
		for(String l:arr)
		{
			//System.out.println(l);
			if(langs.add(l)==false)
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
