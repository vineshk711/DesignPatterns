package src;

import src.impl.ScorpioImpl;

public class IndiaScorpioNImpl extends ScorpioImpl {
    @Override
    public void printSeaftyReq() {
        System.out.println("Seafty Req for India Scorpio");
    }

    @Override
    public boolean isRightHanded() {
        return true;
    }
}
