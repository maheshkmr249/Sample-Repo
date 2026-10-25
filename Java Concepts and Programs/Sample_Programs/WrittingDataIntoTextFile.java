package Sample_Programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WrittingDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\mahes\\Desktop\\Test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Selenium with Java \n");
		bw.write("Selenium with Python \n");
		bw.write("Selenium with c# \n");
		System.out.println("Finished! Data Witten in text file");
		bw.close();
	}
}
