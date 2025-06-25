package oops.interfaces.ProperInterfaces;

public class MediaPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Music begins");
    }

    @Override
    public void stop() {
        System.out.println("Music ends");

    }
}
