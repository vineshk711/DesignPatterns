package ovserver.impl;

import observable.StockObservable;
import ovserver.NotificationAlertObserver;

public class MobileNotificationObserverImpl implements NotificationAlertObserver {

    private final String mobileId;
    private final StockObservable stockObservable;

    public MobileNotificationObserverImpl(String mobileId, StockObservable stockObservable) {
        this.mobileId = mobileId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMobileNotification();
    }

    private void sendMobileNotification() {
        System.out.println("Mobile Notification send to mobileId: " + mobileId);
    }

}
