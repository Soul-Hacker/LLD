package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.Notification;

import java.util.ArrayList;
import java.util.List;

public class StockImpl implements Stock{
    public List<Notification>observerList=new ArrayList<>();
    public int StockCount=0;
    @Override
    public void add(Notification observer) {
    observerList.add(observer);
    }

    @Override
    public int getStockCount() {
        System.out.println(StockCount);
        return StockCount;

    }

    @Override
    public void notifySubscriber() {
    for(Notification obje:observerList)
    {
        obje.update();
    }
    }

    @Override
    public void remove(Notification observer) {
        observerList.remove(observer);

    }

    @Override
    public void setStockCount(int newStockAddded) {
        if(StockCount==0)
        {
            notifySubscriber();
        }
        StockCount+=newStockAddded;
        System.out.println("Stock added"+StockCount);

    }
}
