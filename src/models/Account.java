package models;

public abstract class Account {
    private  String customerName;
    private  String customerLastName;
    private  String customerNCode;
    private String Id;
    public abstract String createAccount();

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerNCode() {
        return customerNCode;
    }

    public void setCustomerNCode(String customerNCode) {
        this.customerNCode = customerNCode;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
