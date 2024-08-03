class Adaptor implements Car {
    HotAirBalloon hotAirBalloon;
    String gasUsed = "Hellium";
    Adaptor(HotAirBalloon balloon) {
        hotAirBalloon = balloon;
    }

    @Override
    public void start() {
        hotAirBalloon.start(gasUsed);
    }

}