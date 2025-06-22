package oops.polymorphism;

public class Circle extends Shapes{
    @Override //gives error if the below method is not overriding some other method
    void area(){
        System.out.println("Area of circle");
    }
}
