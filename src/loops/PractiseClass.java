package loops;

public class PractiseClass {

	public static void main(String[] args) {

		int firstNum = 1;
		int secondNum = 2;
		int thirdNum;
		for (int i = 0; i < 6; i++) {
			thirdNum = firstNum + secondNum;
			{
				System.out.println(thirdNum);
			}
			firstNum = secondNum;
			secondNum = thirdNum;

		}

	}

}
