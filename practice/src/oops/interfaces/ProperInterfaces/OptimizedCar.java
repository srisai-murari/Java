package oops.interfaces.ProperInterfaces;

public class OptimizedCar  {
//syntax : private interfaceName variable
    private Engine engine; //declaring a variable of the interface engine and not initializing it
    private Media media;//to use Media interface through class MediaP we make it as a new object
    private Brake brake;

    public OptimizedCar (){
        engine = new PetrolEngine();
        media = new MediaP();
        brake = new BrakeClass();
    }

    public OptimizedCar(Engine engine){ //to change engine
        this.engine = engine;
    }



// calls start function from Engine (electric or petrol)
//    by default petrol is initialized so petrol car fn will be called
    public void start(){
        engine.start();
            }

    public void stop(){
        engine.stop();
    }

    public void accelerate(){
        engine.accelerate();
    }

    //change engine from petrol to ev
    public void changeEngine(Engine engine){
        this.engine = engine;
        //default print as electric
        System.out.print("Engine changed to ");

    }

    public void musicStart(){
        media.start();
    }

    public void musicStop(){
        media.stop();
    }

    public void brake(){
        brake.brake();
    }



}
