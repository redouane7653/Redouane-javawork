package fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileExample {

	public static void main(String[] args) {
		
		try {
			Writer w=new FileWriter("C:\\qafiles\\upsana.txt", true);
			String content="Welcome to the world of java, i will take you through amazing coding";
			w.write(content); // does the writing
			w.close();// closes the file
			System.out.println("File written sucessfully");
		} catch (IOException e) {

			
			e.printStackTrace();
		}

		
		

	}

}
