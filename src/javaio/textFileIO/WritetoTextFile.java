package javaio.textFileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritetoTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter write1 = new PrintWriter("TestDir/TextFileInside.txt");

		write1.println("Ankitha");
		write1.println("Praveena");
		write1.print("Ramya");
		write1.println("Prashanthi");
		write1.flush();
		write1.close();
	}

}
