package oops.abstraction.interface1;

public class Pig implements Animal {

	public void animalsound() {
		System.out.println("This Pig is Pink in colour ");

	}

	public void sleep() {
		System.out.println("Pig loves to sleeps in puddles");

	}

	public static void main(String[] args) {
		Pig obj1 = new Pig();
		obj1.animalsound();
		obj1.sleep();
	}

}
