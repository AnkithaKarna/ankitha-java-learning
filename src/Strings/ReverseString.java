package Strings;

public class ReverseString {

	public static void main(String[] args) {
		// TO Reverse a string
		String str="Ankitha";
		String reversestr="";
		
		for(int i=str.length()-1;i>=0;i--)
			reversestr=reversestr+str.charAt(i);
		System.out.println(reversestr);
	}

}
