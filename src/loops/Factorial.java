package loops;

public class Factorial {

	public static void main(String[] args) {
		// factorial of 5
		int n = 5;
		int factorialvalue = 1;
		for (int i = n; i >= 1; i--) {
			{
				System.out.println(i);
			}
			factorialvalue = factorialvalue * i;
			{
				System.out.println(factorialvalue);
			}
		}
	}

}
