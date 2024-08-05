package src.concreat;

import src.abstraction.Scorpio;
import src.impl.ScorpioImpl;

public class ScorpioN extends Scorpio {

    public ScorpioN(ScorpioImpl scorpio) {
        super(scorpio);
    }

    @Override
    public void printSeaftyReq() {
        scorpio.printSeaftyReq();
    }

    @Override
    public boolean isRightHanded() {
        return scorpio.isRightHanded();
    }
}
