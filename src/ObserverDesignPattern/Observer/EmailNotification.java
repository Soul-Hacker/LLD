package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.Stock;

public class EmailNotification implements Notification{
    String emailId;
    Stock obj;
//    @Override
    public EmailNotification(String emailId,Stock obj) {
        this.emailId=emailId;
        this.obj=obj;

    }

    @Override
    public void update() {
        sendEmail(emailId,"Product is in stock");
    }
    public void sendEmail(String emailId,String msg)
    {
        System.out.println("Message set to this"+emailId);
    }
}
