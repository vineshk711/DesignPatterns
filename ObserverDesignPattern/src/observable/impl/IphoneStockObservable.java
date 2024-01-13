package observable.impl;

import observable.StockObservable;
import ovserver.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable {

    private int stockCount = 0;
    private List<NotificationAlertObserver> observerList = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        observerList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        observerList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubs() {
        for(NotificationAlertObserver observer: observerList) {
            observer.update();
        }
    }

    @Override
    public void setSockCount(int count) {
        if(stockCount == 0) {
            notifySubs();
        }
        this.stockCount = count;

    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
