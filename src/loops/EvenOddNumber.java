package loops;

public class EvenOddNumber {

	public static void main(String[] args) {
		// to print even numbers
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println("i am even:" + i);
			} else {
				System.out.println("i am odd:"+i);
			}
		}
	}

}
