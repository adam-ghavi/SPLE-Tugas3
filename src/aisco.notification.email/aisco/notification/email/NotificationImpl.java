package aisco.notification.email;
import aisco.notification.core.NotificationDecorator;

public class NotificationImpl extends NotificationDecorator
{
    public NotificationImpl()
    {
    	
    }

    @Override
    public void onDonationRecorded(String name, String email, String phoneNumber, int paymentAmount, String paymentMethod)
    {
        System.out.println("[Email notification] To: " + email);
        System.out.println("  Subject: Thank you for your donation to AISCO");
        System.out.println("  Body: Dear " + name + ", we received " + paymentAmount + " via " + paymentMethod + ". Phone: " + phoneNumber + ".");
    }
}
