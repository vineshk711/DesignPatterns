package src;

import src.abstraction.Scorpio;
import src.concreat.ScorpioN;

public class Main {
    public static void main(String[] args) {
        Scorpio indianScorpio = new ScorpioN(new IndiaScorpioNImpl());
        Scorpio usaScorpio = new ScorpioN(new USAScorpioNImpl());
        System.out.println(indianScorpio.isRightHanded());
        System.out.println(usaScorpio.isRightHanded());
    }
}
