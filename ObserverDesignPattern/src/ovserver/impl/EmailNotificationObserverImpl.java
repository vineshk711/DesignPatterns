package ovserver.impl;

import observable.StockObservable;
import ovserver.NotificationAlertObserver;

public class EmailNotificationObserverImpl implements NotificationAlertObserver {
    private final String email;
    private final StockObservable stockObservable;

    public EmailNotificationObserverImpl(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("Email is sent to: " + email);
    }
}
