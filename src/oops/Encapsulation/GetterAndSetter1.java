package oops.Encapsulation;

public class GetterAndSetter1 {
	private int id;
	private String name;
	// private String email;

	GetterAndSetter1() {
		id = 1;
		name = "Ankitha";
	}

	public int getId() {
		return id;

	}

	public void setId(int idFromCaller) {
		this.id = idFromCaller;
		
		System.out.println(id);
	}

	public String getName() {
		return name;

	}

	public void setName(String name1) {

		this.name = name1;

	}

}
