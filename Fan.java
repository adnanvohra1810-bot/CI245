package Homework_3;

public class Fan {

	    private int speed;
	    private boolean on;
	    private double radius;
	    private String color;

	 
	    public Fan() {
	        speed = 1;
	        on = false;
	        radius = 5.0;
	        color = "white";
	    }

	   
	    public int getSpeed() {
	        return speed;
	    }

	    public boolean isOn() {
	        return on;
	    }

	    public double getRadius() {
	        return radius;
	    }

	    public String getColor() {
	        return color;
	    }

	   
	    public void setSpeed(int value) {
	        speed = value;
	    }

	    public void setOn(boolean value) {
	        on = value;
	    }

	    public void setRadius(double value) {
	        radius = value;
	    }

	    public void setColor(String value) {
	        color = value;
	    }

	 
	    public String toString() {
	        return "Fan [speed=" + speed +
	                ", on=" + on +
	                ", radius=" + radius +
	                ", color=" + color + "]";
	    }
}
