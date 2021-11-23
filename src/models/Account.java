package models;

import java.util.Date;
import java.util.Random;
import java.util.stream.IntStream;

public abstract class Account {
    private  String customerName;
    private  String customerLastName;
    private  String customerNCode;
    private String Id;
    private Date createDate;
    private  double balance;
    private double profit;
    private String type;

    public Account(String customerName, String customerLastName, String customerNCode,String type) {
        this.customerName = customerName;
        this.customerLastName = customerLastName;
        this.customerNCode = customerNCode;
        this.type=type;
        setId(calculateId());
        setCustomerNCode(calculateCustomerNum());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Account() {

    }

    protected  String calculateCustomerNum(){
        Random random=new Random();
        return Integer.toString(random.nextInt(300000));
    }

    protected  String calculateId(){
        Random random=new Random();
        return Integer.toString(random.nextInt(100000));
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
     }

    public abstract String createAccount(Customer customer, double balance);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

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

    @Override
    public String toString() {
        return "Account{" +
                "customerName='" + customerName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", customerNCode='" + customerNCode + '\'' +
                ", Id='" + Id + '\'' +
                ", createDate=" + createDate +
                ", balance=" + balance +
                ", profit=" + profit +
                '}';
    }
}
