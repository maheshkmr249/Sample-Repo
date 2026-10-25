package Strings;

public class RemoveFirstAndLastCharFromString1 {

	public static void main(String[] args) {
		
		
		String str = "GeekForGeeks";
        str = str.substring(1, str.length()-1);
        System.out.println(str);

	}
}
