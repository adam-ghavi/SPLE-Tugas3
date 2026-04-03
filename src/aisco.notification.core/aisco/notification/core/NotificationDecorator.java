package aisco.notification.core;

public abstract class NotificationDecorator extends NotificationComponent
{
    public NotificationComponent notification;

    public NotificationDecorator()
    {
        
    }

    public NotificationDecorator (NotificationComponent notification)
    {
        this.notification = notification;
    }

    
    public String toString()
    {
        return "Send notification to: " + name + " for donating: " + paymentAmount + " via: " + paymentMethod;
    }
}
