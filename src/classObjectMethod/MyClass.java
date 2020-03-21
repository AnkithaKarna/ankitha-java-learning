package classObjectMethod;

public class MyClass {
	int x=10;
	int y=20;
	static void myMethod() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		MyClass myObj=new MyClass();
		myObj.y=30;
		myMethod();
		System.out.println(myObj.x);
		System.out.println(myObj.y);
	}

}
