package oops;
//// class inside a class that is not static
//public class InnerClasses {
//    //if new class is initialized in a class
//    // then it must be static
//
//    class car {
//        String a;
//
//        //constructor
//        public car(String a){
//            this.a = a;
//        }
//    }
//    public static void main(String[] args) {
//        car audi = new car("bodi"); //throws error when class is not static
//        //because if the class is not static then it must be that the class is dependent on some object
////      so it must either be static or it needs to be an independent object
//    }
//}



//// class inside a class but static
    //throws no error

//public class InnerClasses {
//    //if new class is initialized in a class
//    // then it must be static
//
//    static class car {
//        String a;
//
//        //constructor
//        public car(String a) {
//            this.a = a;
//        }
//    }
//
//    public static void main(String[] args) {
//        car audi = new car("bodi"); //doesnt throw an error when class is static
////        because static main class can access other static class car without creating an object
//    }
//}


//// class outside a class (i.e the class doesnt depend on anything)
//// so an independent object of the class can be created without using static
//class car {
//    String a;
//
//    //constructor
//    public car(String a) {
//        this.a = a;
//    }
//}
//public class InnerClasses {
//
//    public static void main(String[] args) {
//        car audi = new car("bodi"); //throws error when class is not static
//        //because if the class is not static then it must be that the class is dependent on some object
////      so it must either be static or it needs to be an independent object
//    }
//}
//


//// outside and static doesnt work
//this is a static class and to access elements in it an object needs to be created
    //static is something where no object needs to be created

    //Hence, it throws an error while declaring
// static class car {
//     String a;
//
//     //constructor
//     public car(String a) {
//         this.a = a;
//     }
// }
//
//public class InnerClasses {
//    //if new class is initialized in a class
//    // then it must be static
//
//
//    public static void main(String[] args) {
//        car audi = new car("bodi"); //error is on the top 👆
//
//    }
//}


//// usage of static variables
//class car {
//    static String a; //static is used here
//    //that means when an element is changed then element is changed for everyother other object
//    //(contd..)that is to be created
//
//    //constructor
//    public car(String a) {
////         this.a = a;//as string is static we can just call it using class name
//        //"this" is not required as "String a" is static
//
//        car.a = a;
//    }
//}
//
//public class InnerClasses {
//
//
//
//    public static void main(String[] args) {
//        car audi = new car("bodi"); //
//        car ferrari = new car("berrari");
//        System.out.println(audi.a);
//        System.out.println(ferrari.a);
//    }
//}

//// usage of static variables

//public class InnerClasses {
//    //if new class is initialized in a class
//    // then it must be static
//    static class car {
//         String a; //static is  not used here
//        //that means when an element is changed then element is not changed for everyother other object
//        //(contd..)that is to be created
//
//        //constructor
//    public car(String a) {
//            this.a = a;
//        }
//    }
//
//
//    public static void main(String[] args) {
//        car audi = new car("bodi"); //
//        car ferrari = new car("berrari");
//        System.out.println(audi.a);
//        System.out.println(ferrari.a);
//    }
//}
//

//// creating an object of innerclass and accessing the classes in it using the innerclass object

public class InnerClasses {
    class car {
        String a;
        //constructor
        public car(String a) {

            this.a = a;
        }
    }



    public static void main(String[] args) {
        InnerClasses test = new InnerClasses();

        InnerClasses.car audi = test.new car("bodi"); //
        InnerClasses.car ferrari = test.new car("berrrari");
        System.out.println(audi.a);
        System.out.println(ferrari.a);
    }
}

