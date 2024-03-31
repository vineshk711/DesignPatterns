package models.panel;

import enums.VehicleType;
import models.ParkingTicket;

import java.time.LocalTime;

public class ExitPanel extends Panel {
    public ParkingTicket checkout(ParkingTicket ticket) {
        Integer amount = calculatePrice(ticket.getVehicleType(), calculateDuration(ticket));
        ticket.setAmount(amount);
        return ticket;
    }

    private Integer calculatePrice(VehicleType spotType, Integer duration) {
        return getParkingSpotRate(spotType) * duration;
    }

    private Integer calculateDuration(ParkingTicket ticket) {
        int hours = LocalTime.now().getHour() - ticket.getStartTime().getHour();
        return hours != 0 ? hours : 1;
    }

    private Integer getParkingSpotRate(VehicleType vehicleType) {
        return switch(vehicleType) {
            case CAR -> 10;
            case TRUCK, ELECTRIC_CAR -> 20;
            case MOTORCYCLE -> 5;
        };
    }
}
