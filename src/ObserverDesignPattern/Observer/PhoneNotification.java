package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.Stock;

public class PhoneNotification implements Notification{
    String UserName;
    Stock obj;
    public PhoneNotification(String UserName,Stock obj)
    {
        this.obj=obj;
        this.UserName=UserName;
    }
    @Override
    public void update()
    {
        SendMessgae(UserName,"Messgae has been sent");

    }
    public void SendMessgae(String UserName,String msg)
    {
        System.out.println("Phone NOtification has been sent to this phone number"+UserName+" "+msg);
    }

}
