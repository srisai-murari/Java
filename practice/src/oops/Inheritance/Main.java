package oops.Inheritance;

public class Main {
    public static void main(String[] args) {
        BoxParent box = new BoxParent();
//        System.out.println(box.weight);//parent class cannot access the child elements
        //whereas the child can access any element present in the parent class that are not private

        BoxChild b = new BoxChild();
        System.out.println(b.weight);

        BoxChild b2 = new BoxChild(1); //initializes l,b,h as -1
        //coz when BoxChild is extended from parentclass then first parent class is called regardlessly
        //after initializing those values it comes to BoxChild and initialized BoxWeight


        //twisted part👇👇

        BoxParent box1 = new BoxChild(1,2,43, 5); //works
//here  👆whatever present here only elements of those class can be accessed
//so, here we have parent class hence we can only access to parent class elements like l,b,w,noAccess
// weight (element that belongs to child class) cannot be accessed through box1.

//        new BoxChild(1,2,43, 5); weight was able to go into box1, because BoxChild class has constructor with those many parameters
//        but it cannot be accessed
//        System.out.println(box1.weight);



//        BoxChild box2 = new BoxParent();//invalid
//as said👆 whatever present here only elements of those class can be accessed
//so, as per that we should be able to access "weight" which is present in BoxChild, but no. why? 👇
//here it doesnt allow that coz...
//to access something present in BoxChild (i.e weight) then those elements must be initialized first
//and here BoxChild is referred as box2 but BoxChild is never initialized instead BoxParent is called as object reference
//weight is smth that never initialized rather (l,h,b) that are present in parent class are initialized
//when something of your own class cannot be accessed then what is the use of it


//⭐⭐ CHILD CLASS CANNOT CREATE A PARENT CLASS but PARENT CLASS CAN CREATE CHILD CLASS(logically)



        //multilevel inheritance test
        BoxGrandChild GC = new BoxGrandChild(1,2,4,5,"buds");
        BoxGrandChild Gc = new BoxGrandChild(10,20,30,50,"darn","it");

        System.out.println(GC.content2);


        BoxGrandChild gxx = new BoxGrandChild();
        System.out.println(gxx.h);

        BoxGrandChild GcCopy = new BoxGrandChild(GC);
        System.out.println(GcCopy.content2);




//accessing the private elements with the help of methods
        BoxParent test = new BoxParent(1,2,3,4);

        System.out.println(test.getNoAccess());
    }


}
