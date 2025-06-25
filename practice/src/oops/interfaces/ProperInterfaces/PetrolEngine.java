package oops.interfaces.ProperInterfaces;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("I start as a petrol car");
    }

    @Override
    public void stop() {
        System.out.println("I stop as a petrol car");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate as a petrol car");
    }
}
