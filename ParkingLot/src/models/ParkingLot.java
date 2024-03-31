package models;

import models.panel.EntryPanel;
import models.panel.ExitPanel;

import java.util.List;

public class ParkingLot {
    public static ParkingLot INSTANCE = new ParkingLot();
    private ParkingLot() { }
    private List<ParkingFloor> parkingFloors;
    private List<EntryPanel> entryPanels;
    private List<ExitPanel> exitPanels;

    public static ParkingLot getInstance() {
        return INSTANCE;
    }

    public void vacateParkingSpot(String parkingSpotId) {
        //TODO implement logic
    }

    public List<ParkingFloor> getParkingFloors() {
        return this.parkingFloors;
    }

    public List<EntryPanel> getEntryPanels() {
        return this.entryPanels;
    }

    public List<ExitPanel> getExitPanels() {
        return this.exitPanels;
    }

}
