package oops.oops5Abstract;

import java.util.Arrays;

public class Son extends Parent{
    Son(){
        super();

    }
    Son (int size){
        super(size);
    }

    @Override
    void greetWithName(String name){
        System.out.println("Hello my name is " + name);
    }

    @Override
    public void career(String career){
        System.out.println("I am a " + career);
    }

    @Override
    public void friends(String [] name){
        System.out.print("My friends are " + Arrays.toString(name));
        if(super.height == 0)
            System.out.println(" idk my height");
        else
            System.out.println(" and my height is " + height + " ft");
    }

//    @Override
//    void greet(){
//        System.out.println("yelloo this is in son class");
//    }

}
