package models;

import enums.ParkingSpotType;

public class DisplayBoard {
    public void displayMessage(ParkingSpotType type, Integer freeSpots) {
        System.out.println(type + " spot contains " + freeSpots + " free spots");
    }
}
