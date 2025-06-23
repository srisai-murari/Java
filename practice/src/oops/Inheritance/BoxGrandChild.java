package oops.Inheritance;

public class BoxGrandChild extends BoxChild {
    String content1;
    String content2;

    BoxGrandChild(){
        super();
        content1 = "empty";
        content2 = "Empty";
    }

    BoxGrandChild(String content1, String content2){
        this.content1 = content1;
        this.content2 = content2;
    }

    BoxGrandChild(BoxGrandChild obj){
        super(obj);
        this.content1 = obj.content1;
        this.content2 = obj.content2;
    }
    BoxGrandChild(double l, double h, double w, double weight, String content1){
        super(l,h,w,weight);
//        super(weight); cannot call multiple super functions in a constructor
//        so if there are any variables that doesnt belong to this class just send all those variables..
//        to the parent class constructor and that constructor passes values that doesnt belong to that..
//        class to its above class or parent class
        this.content1 = content1;

    }

    BoxGrandChild(double l, double h, double w, double weight, String content1, String content2){
        super(l,h,w,weight);
//        super(weight); cannot call multiple super functions in a constructor
//        so if there are any variables that doesnt belong to this class just send all those variables..
//        to the parent class constructor and that constructor passes values that doesnt belong to that..
//        class to its above class or parent class
        this.content1 = content1;
        this.content2 = content2;

    }


}
