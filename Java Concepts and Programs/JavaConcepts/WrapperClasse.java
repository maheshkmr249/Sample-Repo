package JavaConcepts;

public class WrapperClasse {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20);
	
	//Data conversion string to integer
		int i= Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer, Double, Charecter, Boolean
		
		//String to double conversion:
		
		String y="12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean
		
		String k = "true";
	    boolean b=	Boolean.parseBoolean(k);
	    System.out.println(b);
		
	    //int to string conversion
	    
	    int j=200;
	    System.out.println(j+20);
	    
	    String s = String.valueOf(j); //Now it is like "200"
	    System.out.println(s+20);
	    
	    String u = "100A"; //Here we will get number format exception as it is not pure from of integer value
	    Integer.parseInt(u);
	 }
}
