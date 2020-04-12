package collection.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// Set is a linear collection
		// Set is not an ordered collection
		// Set can not have duplicates
		Set<String> subjectObj = new HashSet<String>();
		subjectObj.add("Telugu");
		subjectObj.add("English");
		subjectObj.add("Maths");
		subjectObj.add("Science");
		subjectObj.add("Social");
		System.out.println(subjectObj);
		for (String sub : subjectObj) {
			System.out.println(sub);
		}
		subjectObj.add("Hindi");
		System.out.println(subjectObj);

	}

}
