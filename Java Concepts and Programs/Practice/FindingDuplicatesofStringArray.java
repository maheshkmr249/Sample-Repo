package Practice;

public class FindingDuplicatesofStringArray {

	public static void main(String[] args) {
		String[] arr = {"mahesh","Ramesh", "rakesh"};
		boolean status = false;
		for(int i=0; i<arr.length; i++)
		{
		for(int j=i+1; j<arr.length; j++)
		{
		if(arr[i]==arr[j])
		{
		status = true;
		System.out.println("Duplicate element found: "+arr[i]);
		}
		}
		}
		
	if(status==false)
	{
		System.out.println("Duplicate elements not found");
	}
    }
}