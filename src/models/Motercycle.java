package models;

import Interface.ParkingSpot;

public class Motercycle extends ParkingSpot {
    @Override
    public boolean isFree() {
        return false;
    }
}
