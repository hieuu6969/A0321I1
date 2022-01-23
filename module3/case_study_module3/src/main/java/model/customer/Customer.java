package model.customer;

import model.service.OtherService;
import model.service.Service;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerBirthday;
    private int customerGender;
    private int customerIdCard;
    private String customerPhone;
    private int customerTypeId;
    private String customerAddress;

    public Customer() {
    }

    public Customer(int customerId,
                    String customerName,
                    String customerBirthday,
                    int customerGender,
                    int customerIdCard,
                    String customerPhone,
                    int customerTypeId,
                    String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerBirthday = customerBirthday;
        this.customerGender = customerGender;
        this.customerIdCard = customerIdCard;
        this.customerPhone = customerPhone;
        this.customerTypeId = customerTypeId;
        this.customerAddress = customerAddress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public int getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(int customerGender) {
        this.customerGender = customerGender;
    }

    public int getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(int customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerBirthday='" + customerBirthday + '\'' +
                ", customerGender=" + customerGender +
                ", customerIdCard=" + customerIdCard +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerTypeId=" + customerTypeId +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}
