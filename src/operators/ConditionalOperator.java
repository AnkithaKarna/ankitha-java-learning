package operators;

public class ConditionalOperator {

	public static void main(String[] args) {
		char gender = 'f';
		int age = 23;
		if (gender == 'f') {
			if (age <= 19 && age >= 13) {
				System.out.println("i am teenager");
			} else {
				if (age < 13) {
					System.out.println("i am a girl");
				} else {
					System.out.println("i am a tenager");
				}
			}
		}

	}

}
