package Homework_3;

public class Stock {
	// Data fields
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	// Method
	public Stock (String newSymbol, String newName) {
		symbol = newSymbol;
		name = newName;
	}
	// Accessor method

	public String getSymbol () {
		return symbol;
	}
	

	public String getName(){
		return name;
	
	}

	public double previousClosingPrice() {
		return previousClosingPrice;
	}

	
	public double getcurrentPrice() {
		return currentPrice;
	}

	
	// Mutators method 
	
	public void setPreviousClosingPrice(double newPrice) {
		previousClosingPrice = newPrice;
	}

	public void setCurrentPrice(double newPrice) {
		currentPrice = newPrice;
	}
	
	// Regular method

	public double getChangePercent() {
		
		return (currentPrice - previousClosingPrice)/previousClosingPrice;
		
	}

	public String toString() {
		
		return "The object: \n" + 
				"\nCompany Name:  "+ name + 
				"\nStock symbol:  "+ symbol +
				"\ncurrent Price: $"+ currentPrice +
				"\nPercentage Change : "+ ((int) (getChangePercent()*10000 ))/100.0 + "%"; 

	}
}
