public class Main {
    public static void main(String[] args) {
        HotAirBalloon hotAirBalloon = new HotAirBalloon();
        Adaptor carAdoptor = new Adaptor(hotAirBalloon);
        carAdoptor.start();
        System.out.println("");
    }
}