package constructorAgain;

public class ConstructorAgain {
	int i;
	int j;
	int orderId;
	int productId;
	int orderQuantity;
	double eachProductPrice;
	double tax;
	String deliveryPostalCode;
	String orderTimeStamp;

	ConstructorAgain() {

		i = 1;
		j = 2;

		orderId = 23;
		productId = 1;
		orderQuantity = 5;
		eachProductPrice = 12.5;
		tax = 0.25;
		deliveryPostalCode = "MK44TL";
		orderTimeStamp = "2020-01-01 23:34:21";
	}

	public int getsum() {
		int sum = i + j;
	//	System.out.println("display sum:"+sum);
		return sum;
	}

	public double calculatedFinalPriceAfterGenderDisc(double discountFromCaller, double genderDiscount) {
		double totalPriceBeforeDisc = (orderQuantity * eachProductPrice) + tax;
		double totalPriceafterDisc = totalPriceBeforeDisc - discountFromCaller - genderDiscount;
		return totalPriceafterDisc;
	}

	public static void main(String[] args) {
		ConstructorAgain obj1 = new ConstructorAgain();
		obj1.getsum();

		double k = obj1.calculatedFinalPriceAfterGenderDisc(4.32, 7.45);
		System.out.println(k);
	}

}
