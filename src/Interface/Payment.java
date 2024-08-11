package Interface;

import constants.PaymentStatus;

import java.util.Date;

public abstract class Payment {
    private Double amount;
    private PaymentStatus status;
    private Date timestamp;
    private String transactionId;

    public abstract boolean initiateTransaction();

}
