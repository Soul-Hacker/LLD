package ObserverDesignPattern;

import ObserverDesignPattern.Observable.Stock;
import ObserverDesignPattern.Observable.StockImpl;
import ObserverDesignPattern.Observer.EmailNotification;
import ObserverDesignPattern.Observer.Notification;
import ObserverDesignPattern.Observer.PhoneNotification;

public class Store {
    public static void main(String[] args)
    {
       Stock stock=new StockImpl();
       Notification observer1=new EmailNotification("hemantkrsaw@gmail.com",stock);
       Notification observer2=new PhoneNotification("hemant",stock);
       stock.add(observer1);
       stock.add(observer2);
       stock.getStockCount();
       stock.setStockCount(10);
       stock.getStockCount();
       stock.setStockCount(100);
       stock.getStockCount();
    }
}
