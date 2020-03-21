package arrays;

public class AddingArray {

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40 };
		int arrayLen = array.length;
		int sum = 0;
		for (int i = 0; i < arrayLen; i++) {
			sum = sum + array[i];
			System.out.println(sum);
		}

	}

}
