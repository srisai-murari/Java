//overriding is only done at runtime
package oops.polymorphism;
//this is the base / parent class

//its children are Square, Circle, Rectangle

public class Shapes {

    //every child of this Shapes has area()
//static void area (){  //when static is used for a function that is being overridden then other functions are forced to change them in to static and static functions are something that can be called without creating an object ref. Hence, irrespective of object ref "area" present in parent class is called

////inshort 👇
    //overriding depends on object
    //and static doesnt depend on objects
    // so static functions can never be overridden

// in short static methods cannot be overridden
    void area (){
        System.out.println("in Shapes class");
    }
}

    //using final class. Hence it cannot be inherited by any other class
//public final class Shapes {
//
//    //every child of this Shapes has area()
//
//    void area (){
//        System.out.println("in Shapes class");
//    }
//}
