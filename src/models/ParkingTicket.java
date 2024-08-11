package models;

import Interface.Payment;
import Interface.Vehicle;
import constants.PaymentStatus;
import constants.TicketStatus;

import java.util.Date;

public class ParkingTicket {
    private int ticketNo;
    private Date entryTimestamp;
    private Date exitTimestamp;
    private Double amount;
    private TicketStatus status;

    private Vehicle vehicle;
    private Payment payment;
    private Entrance entrance;
    private Exit exit;
}
