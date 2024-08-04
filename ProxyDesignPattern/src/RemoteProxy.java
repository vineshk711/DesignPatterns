package src;

public class RemoteProxy implements Car {

    private final Scorpio scorpio = new Scorpio();

    public void turnRight() {
        scorpio.turnRight();
    }

    public void turnLeft() {
        scorpio.turnLeft();
    }

}
