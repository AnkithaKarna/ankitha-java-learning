package oops.abstraction;

public class Abstract2 extends Abstract1 {

	public void Transmission() {
		System.out.println("I am Auris Hybrid");

	}

	public void fuelType() {
		System.out.println("I am Auris Petrol");

	}

	public static void main(String[] args) {
		Abstract2 obj1 = new Abstract2();
		obj1.steering();
		obj1.ignition();
		obj1.fuelType();
		obj1.Transmission();
	}

}
