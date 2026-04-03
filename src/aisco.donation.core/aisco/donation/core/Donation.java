package aisco.donation.core;

import aisco.notification.core.Notification;

public interface Donation {
    void getDonation();
    void addDonation();

    void setNotification(Notification notification);
}
