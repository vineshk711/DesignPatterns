package models;

import Interface.Account;

public class AgentAccount extends Account {

    @Override
    public boolean resetPassword() {
        return false;
    }

    public boolean processTicket(ParkingTicket parkingTicket) {
        return true;
    }
}
