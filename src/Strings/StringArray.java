package Strings;

public class StringArray {

	public static void main(String[] args) {
		String[] strAr = new String[5];
		strAr[0] = "Anita";
		strAr[1] = "Sunita";
		strAr[2] = "Samata";
		strAr[3] = "Mamata";
		strAr[4] = "Sandya";
		for (int i = 0; i < strAr.length; i++) {
			System.out.println(strAr[i]);
		}
		for (int i = 0; i < strAr.length; i++) {
			String tempStr = strAr[i];
		
			System.out.println(tempStr.length());
			System.out.println(tempStr.substring(2));
		}

	}

}