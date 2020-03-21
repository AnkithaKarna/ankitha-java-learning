package loops;

public class NestedForLoop {

	public static void main(String[] args) {

		for (int i = 2; i <= 20; i++) {
			System.out.println(i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i * j);
			}

			System.out.println("next table");
		}

	}

}
