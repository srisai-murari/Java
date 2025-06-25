package oops.interfaces.ProperInterfaces;

public class Main {
    public static void main(String[] args) {
        //to initialize a petrol car
        OptimizedCar car = new OptimizedCar();

        //to initialize a car with electric engine
        PetrolEngine pet = new PetrolEngine();
        ElectricEngine ev = new ElectricEngine();
        OptimizedCar evCar = new OptimizedCar(ev);



        car.stop();
        car.musicStop();
        car.brake();
        car.changeEngine(new ElectricEngine());
        System.out.println(ev.engineName);

        evCar.stop();
    }
}
