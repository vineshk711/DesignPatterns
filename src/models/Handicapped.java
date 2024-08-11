package models;

import Interface.ParkingSpot;

public class Handicapped extends ParkingSpot {
    @Override
    public boolean isFree() {
        return false;
    }
}
