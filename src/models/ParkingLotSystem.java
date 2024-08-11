package models;

import Interface.ParkingSpot;
import Interface.Vehicle;

import java.util.Map;

public class ParkingLotSystem {
    private int id;
    private String name;
    private String address;

    private static final Integer MAX_CAPACITY = 40000;

    private Map<String, Entrance> entrance;
    private Map<String, Exit> exit;
    private Map<String, DisplayBoard> displayBoards;
    private Map<String, ParkingTicket> parkingTickets;
    private Map<String, ParkingSpot> parkingSpots;
    private ParkingRate parkingRate;


    //Singleton Design Pattern
    private static ParkingLotSystem instance;

    private ParkingLotSystem() {}

    public static ParkingLotSystem getInstance() {
        //TODO handle it for multithreaded env
        if (instance == null) {
            instance = new ParkingLotSystem();
        }
        return instance;
    }

    public ParkingTicket getParkingTicket(Vehicle vehicle) {
        return null;
    }

    public boolean addEntrance(Entrance entrance) {
        return false;
    }


    public boolean isFull() {
        return false;
    }


}
