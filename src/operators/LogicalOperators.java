package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = 30;
		if (i < j && i < k) {
			System.out.println("Print true");
		} else {
			System.out.println("print false");
		}
		char gender = 'F';
		int age = 23;
		if ((gender == 'F' || gender == 'T') && (age < 19 || age > 13)) {
			System.out.println("print teenager");
		} else {
			System.out.println("print not teenager");
		}
		boolean ismale = true;
		if (ismale == true) {
			System.out.println("male");
		} else {
			System.out.println("Female");
		}
	}

}
