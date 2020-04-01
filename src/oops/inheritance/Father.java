package oops.inheritance;

public class Father extends Grandad {
	int age1 = 55;
	String name1 = "Ram";

	public void getAge() {
		System.out.println("Print my dads age:" + age1);
	}

	public static void main(String[] args) {
		Father fat1 = new Father();
		fat1.getName();
		fat1.getAge();
		System.out.println(fat1.age);
		System.out.println(fat1.name);
		System.out.println(fat1.age1);
		System.out.println(fat1.name1);

	}
}
