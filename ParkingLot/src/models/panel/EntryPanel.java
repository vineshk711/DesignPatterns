package models.panel;

import models.ParkingTicket;
import models.vehicle.Vehicle;

import java.time.LocalTime;
import java.util.UUID;

public class EntryPanel extends Panel {
    private ParkingTicket generateParkingTicket(Vehicle vehicle) {
        ParkingTicket ticket = new ParkingTicket();
        ticket.setTicketId(UUID.randomUUID().toString());
        ticket.setVehicleNumber(vehicle.getVehicleNumber());
        ticket.setVehicleType(vehicle.getType());
        ticket.setStartTime(LocalTime.now());
        //TODO set parking info
        return ticket;
    }
}
