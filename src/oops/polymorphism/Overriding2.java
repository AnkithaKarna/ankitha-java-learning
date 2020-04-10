package oops.polymorphism;

public class Overriding2 extends Overriding1 {
	public void eat() {
		System.out.println("Dyno is rushing to eating");
	}

	public void eat(String Breed) {
		System.out.println("Pug");
	}

	public static void main(String[] args) {
		Overriding2 obj1 = new Overriding2();
		obj1.eat();
		obj1.eat("Pug");

	}

}
