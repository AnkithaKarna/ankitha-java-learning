package javaio;

import java.io.File;
import java.io.IOException;

public class TextFileExample {

	public static void main(String[] args) throws IOException {
		File txtFile = new File("TestFile.txt");
		txtFile.createNewFile();
		System.out.println("Text file is created");

		// creating text file under particular directory
		File txtFile1 = new File("TestDir", "TextFileInside.txt");
		txtFile1.createNewFile();
		System.out.println("Text file is created in desire Directory");
System.out.println(txtFile1.getName());
System.out.println(txtFile1.getAbsolutePath());
	}

}
