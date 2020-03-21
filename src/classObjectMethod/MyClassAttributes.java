package classObjectMethod;

public class MyClassAttributes {
	String fname = "Joe";
	String lname = "Williams";
	int i = 11;

	public static void main(String[] args) {
		MyClassAttributes obj1 = new MyClassAttributes();
		System.out.println("Name:" + obj1.fname + " " + obj1.lname);
		System.out.println("age:" + obj1.i);

	}

}
