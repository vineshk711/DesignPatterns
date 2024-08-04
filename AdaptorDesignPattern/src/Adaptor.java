class Adaptor implements Car {
    HotAirBalloon hotAirBalloon;
    String gasUsed = "Helium";
    Adaptor(HotAirBalloon balloon) {
        hotAirBalloon = balloon;
    }

    @Override
    public void start() {
        hotAirBalloon.start(gasUsed);
    }

}