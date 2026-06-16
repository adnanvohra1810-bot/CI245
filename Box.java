package chapter11;

public class Box extends Ractangle{
    
    // Data Fields
    private double height = 1;
    
    //method
    public Box(){
        super();
        System.out.println("This is defalut Box constructor");
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double newValue){
        height = newValue;
    }
    
    public double computeArea(){
        return length*width*2 + length*height*2 + width*height*2;
    }
    
    public double computeVolume(){
        return super.getArea()* height;
    }
    
    public String toString(){
        return super.toString() +
                "\nHeight = " + height +
                "\nBox Area = " + computeArea()+
                "\nVoulme = " + computeVolume();
    }
}
