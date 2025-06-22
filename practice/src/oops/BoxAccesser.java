package oops;

public class BoxAccesser {
    public static void main(String[] args) {
        BoxParent box = new BoxParent();
//        System.out.println(box.weight);//parent class cannot access the child elements
        //whereas the child can access any element present in the parent class that are not private

        BoxChild b = new BoxChild();
        System.out.println(b.weight);


        //twisted part

        BoxParent box1 = new BoxChild(1,2,43, 5); //works
//here  👆whatever present here only elements of those class can be accessed
//so, here we have parent class hence we can only access to parent class elements like l,b,w,noAccess
// weight (element that belongs to child class) cannot be accessed through box1.

//        new BoxChild(1,2,43, 5); weight was able to go into box1 but it cannot be accessed
//        System.out.println(box1.weight);



//        BoxChild box2 = new BoxParent();//invalid
//as said👆 whatever present here only elements of those class can be accessed
//so, as per that we should be able to access "weight"
//⭐⭐ CHILD CLASS CANNOT CREATE A PARENT CLASS but PARENT CLASS CAN CREATE CHILD CLASS(logically)
//here it doesnt allow that coz...
//to access something, (i.e weight) it must be initialized first
//and here BoxChild is referred as box2 but BoxChild is never initialized instead BoxParent is called





        //multilevel inheritance test
        BoxGrandChild GC = new BoxGrandChild(1,2,4,5,"buds");
        BoxGrandChild Gc = new BoxGrandChild(10,20,30,50,"darn","it");
        System.out.println(GC.content2);

        BoxGrandChild gxx = new BoxGrandChild();
        System.out.println(gxx.h);

        BoxGrandChild GcCopy = new BoxGrandChild(GC);
        System.out.println(GcCopy.content2);
    }
}
