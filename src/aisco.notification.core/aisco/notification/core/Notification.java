package aisco.notification.core;

public interface Notification
{
    void onDonationRecorded(String name, String email, String phoneNumber, int paymentAmount, String paymentMethod);
}
