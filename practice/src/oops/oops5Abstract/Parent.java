package oops.oops5Abstract;

public abstract class Parent {
     int height;
    Parent (){

    }
    Parent (int height){
        this.height = height;
    }
//    static abstract fns (); error static is smth that cannot be changed
//    and abstract is smth that must be overridden

    //js static fns in abstract class
    void greet(){
        System.out.println("yelloo this is in parent class");
    }


    abstract void career(String career);
    abstract void friends(String[]  name);
    abstract void greetWithName(String name);

}
