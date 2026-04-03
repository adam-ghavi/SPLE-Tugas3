package aisco.donation.core;

import aisco.notification.core.Notification;

public abstract class DonationComponent implements Donation
{
    protected String name;
    protected String email;
    protected String phoneNumber;
    protected int paymentAmount;
    protected String paymentMethod;
    
    private Notification notification;
    
    public DonationComponent()
    {
    	
    }
    
    public DonationComponent (String name, String email, String phoneNumber, int paymentAmount, String paymentMethod)
    {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.paymentAmount = paymentAmount;
        this.paymentMethod = paymentMethod;
    }
    
    public void setNotification(Notification notification)
    {
        this.notification = notification;
    }
    
    protected void notify(String name, String email, String phoneNumber, int paymentAmount, String paymentMethod)
    {
        if (notification != null)
        {
			notification.onDonationRecorded(name, email, phoneNumber, paymentAmount, paymentMethod);
        }
    }
    
    public abstract void addDonation();
    public abstract void getDonation();
}
