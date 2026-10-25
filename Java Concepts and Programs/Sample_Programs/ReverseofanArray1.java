package Sample_Programs;

public class ReverseofanArray1 {

	public static void main(String[] args) {
		int[] inArray = {1,2,3,4,5,6};

		int[] revArray = new int[6];

		int count =0;
		for(int i = inArray.length-1;i>=0;i--){
		if(count<=inArray.length){
		revArray[count] = inArray[i];
		count++;
		}
		else{
		break;
		}

		}
		System.out.println(revArray);
	}
}
