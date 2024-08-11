package models;

import Interface.ParkingSpot;

public class Compact extends ParkingSpot {
    @Override
    public boolean isFree() {
        return false;
    }
}
