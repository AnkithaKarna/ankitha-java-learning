package collection.keyValue;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		Map<String, Double> subjectObj = new Hashtable<String, Double>();
		subjectObj.put("Telugu", 98.9);
		subjectObj.put("English", 98.10);
		subjectObj.put("Maths", 96.53);
		subjectObj.put("Science", 94.6);
		System.out.println(subjectObj);
		subjectObj.put("Social", 96.5);
		System.out.println(subjectObj);
		subjectObj.put("null", 96.5);
		System.out.println(subjectObj);

	}

}
