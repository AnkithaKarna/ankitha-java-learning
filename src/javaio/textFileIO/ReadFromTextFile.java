package javaio.textFileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromTextFile {
	public static void main(String[] args) throws IOException {

		BufferedReader read1 = new BufferedReader(new FileReader("TestDir/TextFileInside.txt"));
		String str = read1.readLine();
		while (str != null) {
			System.out.println(str);
			str = read1.readLine();
		}

	}
}