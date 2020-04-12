package collection.keyValue;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Double> subjectObj = new HashMap<String, Double>();
		subjectObj.put("Telugu", 98.9);
		subjectObj.put("English", 98.10);
		subjectObj.put("Maths", 96.53);
		subjectObj.put("Science", 94.6);
		System.out.println(subjectObj);
		// to read a value from Map
		System.out.println(subjectObj.get("Science"));
		//To get all the key set
		System.out.println(subjectObj.keySet());
		// Use the keySet() method if you only want the keys, 
		//and use the values() method if you only want the values:
		
		for(String sub:subjectObj.keySet()) {
			System.out.println(sub);
		}
		subjectObj.put("null",90.3);
		System.out.println(subjectObj);

	}

	

}
