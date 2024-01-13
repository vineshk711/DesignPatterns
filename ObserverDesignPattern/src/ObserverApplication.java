import observable.StockObservable;
import observable.impl.IphoneStockObservable;
import ovserver.NotificationAlertObserver;
import ovserver.impl.EmailNotificationObserverImpl;
import ovserver.impl.MobileNotificationObserverImpl;

public class ObserverApplication {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservable();

        NotificationAlertObserver observer1 = new EmailNotificationObserverImpl("vinesh@google.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailNotificationObserverImpl("kumar@google.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileNotificationObserverImpl("vineshIphone", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setSockCount(10);
        iphoneStockObservable.setSockCount(0);
        iphoneStockObservable.setSockCount(10);

    }
}