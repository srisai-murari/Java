//// LANGUAGE WITHOUT POLYMORPHISM ARE NOT CONSIDERED AS OOP LANGUAGE

package oops.polymorphism;
//DYNAMIC POLYMORPHISM
public class FinalCaller {
    public static void main(String[] args) {
        Shapes shape =  new Shapes();


        //an object of each child class is made
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();

        circle.area(); //calls the area() method present in Circle class
        square.area(); //same
        rectangle.area(); //same

        //if the objects called like this
//      parent_class variable = new child_class();
        //// check inheritance(class BoxAccessor) for more info

        Shapes cir = new Circle();
        Shapes sq = new Square();
        Shapes rect = new Rectangle();

        cir.area();
        //it calls Circle area()method instead of calling Shapes area()method
//        whyy??
//        Shapes cir --> this is processed in compile time

//        new Circle(); --> reference variables are obtained during runtime

        //        new circle()👈👈👈👈👈👈👈👈👈👈👈
        //which method is to be called is dependent on the 👆 and this and it is called upcasting

//        Shapes cir ---> "Shapes" only says what is has access to. It has access to area()of its own class
//        but during run time it overrides and calls Circle's area()

//        now which area()method is called is dependent on object


//how does java decide which method to be called ---> it determines usinig "DYNAMIC METHOD DISPATCH"
//DYNAMIC METHOD DISPATCH ?
//        Its a mechanism in which a call to a overridden method is resolved at runtime, rather than at compile time
    }
}
