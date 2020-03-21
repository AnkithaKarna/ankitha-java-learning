package arrays;

public class Largestnumarray {

	public static void main(String[] args) {

		int[] myArray = { 450, 600, 1234, 540, 879, 323, 657 };

		int tempVar = myArray[0]; // 450

		for (int i = 0; i < myArray.length; i++) {

			if (myArray[i] > tempVar) {
				tempVar = myArray[i];
			}

			/*
			 * if (myArray[i] < tempVar) { continue; }
			 * 
			 * tempVar = myArray[i];
			 */

		}
		System.out.println(tempVar);
	}

}
