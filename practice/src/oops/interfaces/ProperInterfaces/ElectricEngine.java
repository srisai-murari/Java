package oops.interfaces.ProperInterfaces;

public class ElectricEngine implements Engine{
    String engineName = "Electric";
    public void start(){
        System.out.println("I start as a Electric car");
    }
    public void stop(){
        System.out.println("I start as an elec car");
    }
    public void accelerate(){
        System.out.println("I accelerate as an elec car");
    }
}
