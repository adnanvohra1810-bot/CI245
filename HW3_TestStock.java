package Homework_3;

public class HW3_TestStock {

	public static void main(String[] args) {
		Stock myStock = new Stock("OPCL", "Oracle Corporation");
		myStock.setPreviousClosingPrice(34.5);
		myStock.setCurrentPrice(31.35);
		System.out.println(myStock);
		
		Stock yourStock = new Stock("APPLE", "Apple Inc.");
		yourStock.setPreviousClosingPrice(299);
		yourStock.setCurrentPrice(302);
		System.out.println(yourStock); 
	}

}
