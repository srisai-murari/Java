package oops.interfaces;



public class NormalCar implements Engine, Brake, MediaNormal{
    int a = 10;
    @Override
    public void accelerate() {
        System.out.println("this is how normal car accelerate");
    }
//both media and car using same method. Doesn't throw an error but says car stops when music is stopped
    public void start(){
        System.out.println("this is how normal car start");
    }


    public void stop(){
        System.out.println("this is how normal car stop");

    }
    public void brake(){
        System.out.println("this is how normal car brake");
    }
}
