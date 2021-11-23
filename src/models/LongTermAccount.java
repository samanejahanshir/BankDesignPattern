package models;

import java.util.Random;

public class LongTermAccount extends Account{
    public LongTermAccount(String customerName, String customerLastName, String customerNCode,String type) {
        super(customerName, customerLastName, customerNCode,type);
    }

    @Override
    public String createAccount(Customer customer,double balance) {

       return "Long term account created .";
    }
}
