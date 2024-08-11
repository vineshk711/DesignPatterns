package models;

import Interface.ParkingSpot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisplayBoard {
    private int id;
    private Map<String, List<ParkingSpot>> parkingSpots;

    public DisplayBoard(int id) {
        this.id = id;
        this.parkingSpots = new HashMap<>();
    }

    public void showFree() {

    }

    public void sendParkingFullNotification() {

    }

    public void addParkingSpot(String type, List<ParkingSpot> parkingSpots) {
        this.parkingSpots.put(type, parkingSpots);
    }
}
