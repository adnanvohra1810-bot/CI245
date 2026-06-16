package chapter11;

public class Ractangle {
	
	// Data fields
	protected double width = 1.0;
	protected double length = 1.0;
	
	// Method
	public Ractangle(){
		System.out.println("This is default rectangle constructor");
		
	}
	
	// accessor
	public double getWidth() {
		return width;
			
	}
	public double getLength(){
		return length;
	}
	
	
	// Mutator 
	public void setWidth(double newValue){
		width = newValue;
		
	}
	
	public void setlength(double newValue){
		length = newValue;
	}
	

	public double getArea(){
		return width * length;
	}
	
	public String toString(){
		
		return "----Rec object ----" +
				"Width = " + width +
			   "\nLength = " + length +
			   "\nArea = " + getArea();
	}
}
	
