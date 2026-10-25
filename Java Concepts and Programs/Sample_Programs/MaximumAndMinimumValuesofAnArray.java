package Sample_Programs;

public class MaximumAndMinimumValuesofAnArray {

	public static void main(String[] args) {
	
	/*	int a[]= {50,20,15,65,45};
		
		int max=a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
      System.out.println("Maximum number of an array is: "+max);
	*/
		int a[]= {50,20,15,65,45,10, 2};
		
        int min=a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum element of an array is: "+min);
	}
}
