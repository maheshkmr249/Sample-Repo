package Sample_Programs;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		//Approach 1 using fileReader and bufferReader
		
	/*	FileReader fr = new FileReader("E:\\Selenium Jars\\sample_text_file.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close(); */
		
		//Apprach2: using scanner and file
		
		File file = new File("E:\\Selenium Jars\\sample_text_file.txt");
		Scanner sc = new Scanner(file);
		
		//loop
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		
		//Approach 3
		/*sc.useDelimiter("\\Z");
		System.out.println(sc.next());*/
	}
}
