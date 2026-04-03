package aisco.notification.core;

public abstract class NotificationComponent implements Notification
{
    protected int id;
    protected String name;
    protected String email;
    protected String phoneNumber;
    protected int paymentAmount;
    protected String paymentMethod;
    
    public NotificationComponent()
    {
    	
    }
    
    public NotificationComponent(int id, String name, String email, String phoneNumber, int paymentAmount, String paymentMethod)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.paymentAmount = paymentAmount;
        this.paymentMethod = paymentMethod;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public void setPaymentAmount(int paymentAmount)
    {
        this.paymentAmount = paymentAmount;
    }
    
    public int getPaymentAmount()
    {
        return paymentAmount;
    }

    
    public void setPaymentMethod(String paymentMethod)
    {
        this.paymentMethod = paymentMethod;
    }
}
