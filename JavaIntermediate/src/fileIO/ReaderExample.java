package fileIO;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


public class ReaderExample {

	public static void main(String[] args) {
		try {
			Reader r=new FileReader("C:\\qafiles\\upsana.txt");
			int data=r.read(); // only first character
			while(data != -1)// loops through the all the char until
			{
				System.out.print((char)data);
				data=r.read(); // read next character
			}
			//System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}

}

}
