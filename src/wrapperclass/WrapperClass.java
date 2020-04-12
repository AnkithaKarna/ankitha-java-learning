package wrapperclass;

public class WrapperClass {

	public static void main(String[] args) {
		int i = 5;
		int j = 10;
		
		Integer obj1 = 5;// auto wrapping
		int v = obj1.intValue();// auto unwrapping
		Integer obj2 = 10;
		int v1 = obj2.intValue();

		Integer sum1 = obj1.intValue() + obj2.intValue();
		System.out.println(sum1);
		int id = Integer.parseInt("123");
		System.out.println(id);

	}

	
}
