package Sample_Programs;

public class FinindingMissingNumberInArray {

	public static void main(String[] args) {
		
		//Array should not have duplicate values
		//Array in array no need to be in sorted order
		//Values should be in range
		
		int a[] = {1,2,3,5,4,7,8,9,10};
		
		int sum1=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum1=sum1+a[i];
		}
       System.out.println("sum of elements in array is: "+sum1);
       
       int sum2=0;
       for(int i =0; i<=10;i++) 
       {
    	   sum2=sum2+i;
       }
       
       System.out.println("sum of range of elements in array is: "+sum2);
       System.out.println("Missing number in array is: "+(sum2-sum1));
  }
}
