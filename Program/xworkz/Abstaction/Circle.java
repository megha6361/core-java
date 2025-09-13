package xworkz.Abstaction;

public class Circle extends Shape{
    private final float PIE = 3.14f;
     private int radius;
     public Circle(){
     }
     public Circle(int radius){
         this.radius = radius;
     }
     public float calculateArea(){
         return PIE * radius * radius;
     }
}
