package Sample_Programs;

public class VowelConsonentUsingSwitch {

	public static void main(String[] args){
		char ch = 'e';

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println("The entered Charecter "+ch+" is Vowel");
		break;
		default:
		System.out.println("The entered Charecter "+ch+" is consonent");

		}
	}
}
