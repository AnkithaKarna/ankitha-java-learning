package collections.linear;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	// this is an interface
	// it can hold duplicate values

	public static void main(String[] args) {
		// String strAr=new String[5];this array can only have String value
		List<String> subjectObj = new ArrayList<String>();
		subjectObj.add("Telugu");
		subjectObj.add("English");
		subjectObj.add("Maths");
		subjectObj.add("Science");
		subjectObj.add("social");
		// You can not add a value which is not string
		// subjectList.add(123); This is not acceptable
		for (String sub : subjectObj) {
			System.out.println(sub);
		}
		int listSize = subjectObj.size();
		System.out.println(listSize);
//to add an element to array
		subjectObj.add("Hindi");
		for (String sub : subjectObj) {
			System.out.println(sub);
		}

		// to read a value from string
		System.out.println(subjectObj.get(2));
		// get list size again
		listSize = subjectObj.size();
		System.out.println(listSize);
		// usage of loops
		if (subjectObj.isEmpty() == true) {
			System.out.println("list is empty");
		} else {
			System.out.println("list is full");
		}
		subjectObj.remove(5);
		System.out.println(subjectObj);
		if (subjectObj.contains("Maths")) {
			System.out.println("yes there is Maths");
		} else {
			System.out.println("No there isnt");
		}
	}
}
