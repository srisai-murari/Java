package oops.oops5Abstract;

import java.util.Arrays;

public class Daughter extends Parent {
    Daughter (){
        super();
    }

    Daughter (int size){
        super(size);
    }

    @Override
    void greetWithName(String name){
        System.out.println("Hello and my name is" + name);
    }

    @Override
    void career(String career){
        System.out.println("I am a " + career);
    }


    @Override
    void friends(String[] name){
        System.out.println("My friends are " + Arrays.toString(name) + "and my height is " + this.height + " ft");
    }

    @Override
    void greet(){
        System.out.println("yelloo this is in daughter class");
    }
}
