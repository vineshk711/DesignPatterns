package src;

import src.impl.ScorpioImpl;

public class USAScorpioNImpl extends ScorpioImpl {
    @Override
    public void printSeaftyReq() {
        System.out.println("Seafty Req for USA Scorpio");
    }

    @Override
    public boolean isRightHanded() {
        return false;
    }
}
