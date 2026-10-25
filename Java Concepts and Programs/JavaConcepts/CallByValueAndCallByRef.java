package JavaConcepts;

public class CallByValueAndCallByRef {
	int p;
	int q;

	public static void main(String[] args) {
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		int x= 20;
		int y = 20;
		System.out.println(obj.testSum(x,y)); //call by value or pass by value, here the values of x and y is given to a and b
		
		obj.p=50;
		obj.q=60;
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
	public int testSum(int a, int b) {
		int c= a+b;               //If we declare a and b here, then it wont take x and y values of main()
		return c;
	}
	
	//call by ref
	public void swap(CallByValueAndCallByRef t) { //here t is assigned to obj
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;	
	}
}
