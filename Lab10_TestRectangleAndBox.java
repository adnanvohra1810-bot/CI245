package chapter11;
import java.util.Scanner;

public class Lab10_TestRectangleAndBox {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        //Create a new Recatangle object named as myRec
        Ractangle myRec = new Ractangle();
        
        //Display myRec's width, length and area
        /*
        System.out.println("Width =" + myRec.getWidth());
        System.out.println("Length =" + myRec.getLength());
        System.out.println("Area =" + myRec.getArea());
        */
        System.out.println(myRec);
        
        // Ask user to enter myRec's width, length
        System.out.print("Please enter new width =");
        double newWidth = input.nextDouble();
        System.out.print("Please enter new length =");
        double newLength = input.nextDouble();    
        
        // Change the myRec's has new width and new length
        myRec.setWidth(newWidth);
        myRec.setlength(newLength);
        
        //Display myRec's width, length and area
        /*
        System.out.println("Width =" + myRec.getWidth());
        System.out.println("Length =" + myRec.getLength());
        System.out.println("Area =" + myRec.getArea());
    `    */
        System.out.println(myRec);
        
        
        
        
        //create a new box
        
        Box myBox = new Box();
        System.out.println(myBox);
        // enter new values
        System.out.print("Please enter new width =");
        newWidth = input.nextDouble();
        System.out.print("Please enter new length =");
        newLength = input.nextDouble();
        System.out.print("Please enter new height =");
        double newHeight = input.nextDouble();    
        
        
        //set new values
        myBox.setWidth(newWidth);
        myBox.setlength(newLength);
        myBox.setHeight(newHeight);
        
        System.out.println(myBox);
    }
    
    
}

