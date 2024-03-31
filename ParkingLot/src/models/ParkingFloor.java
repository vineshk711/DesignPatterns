package models;

import enums.ParkingSpotType;
import models.spot.ParkingSpot;
import models.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParkingFloor {
    private Map<ParkingSpotType, List<ParkingSpot>> parkingSpotsMap;
    private String parkingFloorId;
    private DisplayBoard displayBoard;

    public String getParkingFloorId() {
        return this.parkingFloorId;
    }
    public Map<ParkingSpotType, List<ParkingSpot>> getParkingSpotsMap() {
        return this.parkingSpotsMap;
    }

    public ParkingSpot getAvailableParkingSpot(Vehicle vehicle) {
        //TODO implement this logic
        List<ParkingSpot> parkingSpots = parkingSpotsMap.getOrDefault(getSpotTypeForVehicle(vehicle), new ArrayList<>());
        return parkingSpots.stream().findFirst().get();
    }

    public void showDisplayBoard() {
        assert(parkingSpotsMap != null);
        parkingSpotsMap.forEach((spotType, spots)  -> {
            int emptySlotsCount = (int) spots.stream().filter(ParkingSpot::isSpotAvailable).count();
            this.displayBoard.displayMessage(spotType, emptySlotsCount);
        });
    }

    public ParkingSpotType getSpotTypeForVehicle(Vehicle vehicle) {
        return switch(vehicle.getType()) {
            case CAR -> ParkingSpotType.CAR;
            case ELECTRIC_CAR -> ParkingSpotType.ELECTRIC_CAR;
            case TRUCK -> ParkingSpotType.TRUCK;
            case MOTORCYCLE -> ParkingSpotType.MOTORCYCLE;
            default -> ParkingSpotType.LARGE;
        };
    }



}
