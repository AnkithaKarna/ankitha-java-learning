package datatypes;

public class VariableTypes {
	int empId;
	String name;
	static String company = "TCS";
	double salary;

	VariableTypes() {
		empId = 1;
		name = "Ankitha";
		salary = 2900;
	}

	VariableTypes(int empIdCaller, String nameCaller, double salaryCaller) {
		empId = empIdCaller;
		name = nameCaller;
		salary = salaryCaller;

	}

	public void getId() {
		System.out.println("Print Id:" + empId);
	}

	public void getName() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		VariableTypes var1 = new VariableTypes();
		System.out.println(var1.empId);
		System.out.println(var1.name);
		System.out.println(VariableTypes.company);// calling static variable with class name
		var1.getId();
		var1.getName();

	}
}
