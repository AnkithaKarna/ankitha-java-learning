package oops.polymorphism;

public class OverLoading {
	//Method Overloading => Is a concept in which multiple methods with same name
	// and different parameters
	// Different parameters => Diff no of params, Diff data types,
	// If method name is same, number of parameters is same and data types of al the
	// parameters ar same and returnType is also same,then it throws compilation
	// error
	public void getSum(int a, int b) {
		System.out.println( a + b);
	}

	public void getSum(int i, int j, int k) {
		System.out.println( i + j + k);
	}

	public static void main(String[] args) {
		OverLoading obj1 = new OverLoading();
		obj1.getSum(5, 4);
		System.out.println(".....");
		obj1.getSum(3, 4, 5);
	}
}
