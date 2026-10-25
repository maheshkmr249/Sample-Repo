package JavaConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ThowsExample {
	  // The 'findFile' method declares that it might throw an IOException
    public static void findFile() throws IOException {
        // Code that may produce IOException, such as a file not being found
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile); // This line can throw FileNotFoundException, which is an IOException
        System.out.println("File found and opened.");
        stream.close();
    }

    public static void main(String[] args) {
        try {
            // The calling method (main) must handle the declared exception
            findFile();
        } catch (IOException e) {
            // Handle the exception if the file is not found or other IO error occurs
            System.out.println("Exception caught: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
