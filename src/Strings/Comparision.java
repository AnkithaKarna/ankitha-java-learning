package Strings;

public class Comparision {

	public static void main(String[] args) {
		// Comparison is in two Methods
		// equals()
		// equalIgnoreCase()
		String str1 = "Praveena";
		String str2 = "praveena";
		if (str1.equals(str2)) {
			System.out.println("both same");
		} else {
			System.out.println("not same");
		}

		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("They are same");
		} else {
			System.out.println("They are not same");
		}
	}

}
