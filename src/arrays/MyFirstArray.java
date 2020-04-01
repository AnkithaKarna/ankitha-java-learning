package arrays;

public class MyFirstArray {

	public static void main(String[] args) {
		int[] array1 = new int[4];
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;
		int arraylength = array1.length;
		System.out.println("print array lenght:" + arraylength);
		for (int i = 0; i < arraylength; i++)

		{
			System.out.println(array1[i]);
		}
	}

}
