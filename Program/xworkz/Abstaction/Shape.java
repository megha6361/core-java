package xworkz.Abstaction;

public abstract class Shape {
    private String color;

    public Shape(){}
    public Shape(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }// concrete method - method having method body
    public abstract float calculateArea();
    //abstract method - method doesn't have method body

}
