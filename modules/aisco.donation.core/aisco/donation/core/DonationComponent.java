package aisco.donation.core;

import aisco.notification.core.Notification;

public abstract class DonationComponent implements Donation
{
    protected String name;
    protected String email;
    protected String phone;
    protected int amount;
    protected String paymentMethod;

    private Notification notification;

    public DonationComponent()
    {
    	
    }

    public DonationComponent (String name, String email, String phone, int amount, String paymentMethod)
    {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    protected void notifyDonationRecorded(String donorName, String donorEmail, String donorPhone, int donatedAmount, String method) {
        if (donationNotificationListener != null) {
            donationNotificationListener.onDonationRecorded(donorName, donorEmail, donorPhone, donatedAmount, method);
        }
    }

    public abstract void addDonation();
    public abstract void getDonation();

}