package src;

public class Main {
    public static void main(String[] args) {
        Car scorpioRemoteProxy = new RemoteProxy();
        scorpioRemoteProxy.turnRight();
        scorpioRemoteProxy.turnLeft();
    }
}
