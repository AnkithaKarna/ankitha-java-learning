package oops.Encapsulation;

public class Encapsulation2 extends Encapsulation1 {
	String name = "Ankitha";
	int Id = 10;

	public void getDetails() {
		System.out.println("My Name is:" + name);
		System.out.println("My Id is:" + Id);
	}

	public static void main(String[] args) {
		Encapsulation2 encap = new Encapsulation2();
		encap.getDetails();
		encap.getSum();
		System.out.println(encap.name);
		System.out.println(encap.Id);

	}
}
