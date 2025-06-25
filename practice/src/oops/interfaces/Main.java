package oops.interfaces;

public class Main {
    public static void main(String[] args) {
        NormalCar car = new NormalCar();

//        Engine car2 = new NormalCar(); works
//        same rules
//        parent_class var = new childClass(); //this works in inheritance
//        variables that are present in parent class can be accessed unless and until they are notprivate
//        and methods are overridden by the childClass methods
        //so technically we cannot use this
//        int b = car2.a; car2 i,e Engine class doesnt contain variable 'a'


        int a = car.a;
        System.out.println(a);

        car.stop();
        car.brake();

        MediaNormal carMedia = new NormalCar();
        carMedia.stop(); //car is stopping instead of media
        //so check notes and properInterfaces package



    }
}
