package wrapperclass;

public class WrapperClass {
	
	
	public static void main(String[] args) {
		int i=5;
		int j=10;
		int sum=i+j;
		Integer obj1=5;//auto object
		int v =obj1;//auto wrapping
		Integer obj2=10;
		int v1=obj2;
		
		Integer sum1=obj1.intValue()+obj2.intValue();
		System.out.println(sum1);
		
		
	}

	
	
	

}
