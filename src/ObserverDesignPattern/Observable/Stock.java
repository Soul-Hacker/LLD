package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.Notification;

public interface Stock {
    public void add(Notification observer);
    public void remove(Notification observer);
    public void notifySubscriber();
    public void setStockCount(int newStockAddded);
    public int getStockCount();
}
