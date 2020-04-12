package javaio;

import java.io.File;

public class DirectoryExample {

	public static void main(String[] args) {
		File aa = new File("TestDir");
		aa.mkdir();
		System.out.println("Done");

	}

}
