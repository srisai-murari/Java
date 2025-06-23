package oops.Inheritance;
////NOTE : child class cannot access parent class's elements that are set private
public class BoxChild extends BoxParent {

    double weight;

    BoxChild (){
        this.weight = -1;
    }

    BoxChild(double weight){
        super(); //when no super is mentioned then default ParentConstructor is called i,e BoxParent(){...}
        this.weight = weight;
    }

    BoxChild(double l, double h, double w){
        super(l,h,w);
    }

    //using parent elements in child through constructor

    BoxChild (double l, double h, double w, double weight){
//        this.l = l;
//        this.h = h;
//        this.w = w;
        //instead of manually intializing them call the parent constructor using "super"

        super(l,h,w); // calls the constructor present in the parent class
        //if super is not mentioned then default constructor of parent class is called i.e (BoxParent(){...})
        this.weight = weight;


//        super(l, h, w); //gives an error coz everytime parent class must be initialized
//        reason : parent class doesnt care what child class does
//        but changes done in parent class affect child class
//        so changes must be done first in parent class and then child class


        //box cannot access private elements


//        this.noAccess = weight;
//        this gives error as the "noAccess" variable is something only one class have access to


    }

    //modifying private element using constructor calls
    BoxChild (double l, double h, double w, double weight, double noAccess){
        super(l,h,w,noAccess);//the super class calls the constructor that is present in the parent class itself
        //the same class's constructor is being called so, the element can be accessed with no error
        this.weight = weight;

        System.out.println(this.weight); //points to variable of this class
        //"this" : accesses the elements present in the same class
        // if we want to access the variable that has same name present in parent class we need to use
        //super.weight;
        System.out.println(super.weight);//points to variable in parent class
    }
    //QUESTION : if the noAccess can be modified using constructors
    // how can they be accessed?


    //passing child class as argument
    BoxChild(BoxChild obj){
        super(obj); //sending BoxChild class to BoxParent
        // where BoxParent is expecting a BoxParent obj as input.
        //why no error, when BoxParent is expecting BoxParent class but not giving error when BoxChild is passed
//its like this "BoxParent obj = new BoxChild();" (explaination is given in BoxAccessor

    }



}





