public class Main {
    public static void main(String[] args) {
        HotAirBalloon hotAirBalloon = new HotAirBalloon();
        Adaptor carAdaptor = new Adaptor(hotAirBalloon);
        carAdaptor.start();
    }
}