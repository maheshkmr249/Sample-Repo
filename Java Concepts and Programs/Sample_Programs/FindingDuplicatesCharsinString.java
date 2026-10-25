package Sample_Programs;

public class FindingDuplicatesCharsinString {

	public static void main(String[] args) {
		String str= "Goldmann sakkkkkjjjjchppps";
		String s="";
	    char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++){
		for(int j=i+1;j<ch.length;j++){
		if(ch[i]==ch[j]){
		if(!s.contains(String.valueOf(ch[i]))){
		s=s+ch[i]; 
		}
	  }
   }
}
	System.out.println(s);
	}
}
