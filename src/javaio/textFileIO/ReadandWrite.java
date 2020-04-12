package javaio.textFileIO;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class ReadandWrite {

	public static void main(String[] args) throws IOException {
		// In this example , we are reading one line at a time from a text file,
		// Verifying if line contains "Ankitha" keyword, If contains , then we are
		// writing that line to another file
		BufferedReader read1 = new BufferedReader(new FileReader("TestDir/TextFileInside.txt"));
		PrintWriter writer1 = new PrintWriter("TestDir/TextFileInside.txt");
		String line = read1.readLine();
		while (line != null) {

		
		if (line.contains("Ankitha")) {
			System.out.println(line);
			writer1.println(line);
			line = read1.readLine();

		}
		writer1.flush();
		writer1.close();

	}
}
}