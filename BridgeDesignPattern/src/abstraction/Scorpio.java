package src.abstraction;

import src.impl.ScorpioImpl;

public abstract class Scorpio {

    //BRIDGE
    public ScorpioImpl scorpio;

    public Scorpio(ScorpioImpl scorpio) {
        this.scorpio = scorpio;
    }


    public abstract void printSeaftyReq();
    public abstract boolean isRightHanded();
}
