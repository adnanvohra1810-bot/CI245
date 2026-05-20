package Homework_3;

public class TestFan {

	public static void main(String[] args) {
		

		
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setOn(true);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");

    
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setOn(false);
        fan2.setRadius(5.0);
        fan2.setColor("blue");

       
        System.out.println("Fan 1:");
        System.out.println(fan1.toString());

        System.out.println();

        System.out.println("Fan 2:");
        System.out.println(fan2.toString());
    }

}


