package oops.Encapsulation;

public class GetterAndSetter2 {

	public static void main(String[] args) {
		GetterAndSetter1 obj1 = new GetterAndSetter1();
		System.out.println(obj1.getId());
		System.out.println(obj1.getName());
		obj1.getId();
		obj1.getName();
		obj1.setId(12);
		obj1.setName("swetha");
		System.out.println(obj1.getId());
		System.out.println(obj1.getName());

	}

}
