package observable;

import ovserver.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver notificationAlertObserver);
    public void remove(NotificationAlertObserver notificationAlertObserver);
    public void notifySubs();
    public void setSockCount(int count);
    public int getStockCount();
}
