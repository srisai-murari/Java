package oops.oops5Abstract;

public class Main {
    public static void main(String[] args) {
        Son son1 = new Son();
        son1.career("Scientist");
        son1.friends(new String[4]);
        son1.greetWithName("son1");


        System.out.println();

//        Parent daughter1 = new Daughter(4);
//      this works too check polymorphism the methods which you can access is determined by the
//        "dynamic method dispatch:" so here the methods are accessed from Daughter which is decided at run time
        Daughter daughter1 = new Daughter(4);
        daughter1.career("Doc");
        daughter1.friends(new String[]{"ramya", "raju"});
        daughter1.greetWithName("daughter1janab");

//        Parent dad = new Parent()
//        object of an abstract class cannot be created because we initialized no fns in parent class
//        they are js abstract classes

        //accessing static methods from Main class

//works only if the methods are static //change the parent class greet to static
//        Son.greet();//gives same as they are calling same fn present in the parent class
//        Daughter.greet(); //calling with Class name bc it is static
//        Parent.greet();//same thing again


        //accessing non static methods using obj references //js for revision
        son1.greet();//parent class runs here coz the greet fn isnot being overridden by son class
        daughter1.greet();
//        Parent.greet(); //if the parent has static keyword then it cannot be overridden...
//                         ...so it cannot work without static in it
    }
}
