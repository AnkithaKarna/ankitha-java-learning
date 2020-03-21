package loops;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// fibonacci series
		// 1,2,3,5,8,13,21,34,55....
		int firstNum = 1;
		int secondNum = 2;
		int thirdNum;
		System.out.println( firstNum);
		System.out.println(secondNum);
		for(int i=0;i<20;i++) {
			thirdNum=firstNum+secondNum;
			System.out.println(thirdNum);
			firstNum=secondNum;
			secondNum=thirdNum;
			
		}
		
		}

	}


