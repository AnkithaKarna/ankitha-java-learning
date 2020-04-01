package constructorAgain;

public class ConstructorOverloading {
	int empid;
	String name;
	String company;
	double salary;

	ConstructorOverloading() {
		empid = 1;
		name = "Ankitha";
		company = "TCS";
		salary = 30000.00;
	}

	ConstructorOverloading(int empidCaller, String nameCaller, String companyCaller, double salaryCaller) {
		empid = empidCaller;
		name = nameCaller;
		company = companyCaller;
		salary = salaryCaller;

	}

	public void getEmpid() {
		System.out.println(empid);
	}

	public void getName() {

		System.out.println(name);

	}

	public void getCompany() {
		System.out.println(company);
	}

	public void getSalary() {
		System.out.println(salary);
	}

	public static void main(String[] args) {
		ConstructorOverloading obj1 = new ConstructorOverloading();
		obj1.getEmpid();
		obj1.getName();
		obj1.getCompany();
		obj1.getSalary();
		ConstructorOverloading obj2 = new ConstructorOverloading(2, "Praveena", "TCS", 3100);
		obj2.getEmpid();
		obj2.getName();
		obj2.getCompany();
		obj2.getSalary();

	}

}
