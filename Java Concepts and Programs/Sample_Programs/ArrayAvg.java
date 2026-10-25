package Sample_Programs;

public class ArrayAvg {

	public static void main(String[] args) {
	
		
		int a[] = {10,20,30,50,60};
		int i, sum, avg;
		sum =0;
		for(i=0;i<a.length;i++) {
			
			sum+= a[i];
		}
		
		avg= sum/a.length;
		System.out.println("Avg of given array is: "+avg);
	}
}
