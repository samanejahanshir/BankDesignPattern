package models;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

public class CurrentAccount extends   Account{
    public CurrentAccount(String customerName, String customerLastName, String customerNCode, String type) {
        super(customerName, customerLastName, customerNCode, type);
    }

    @Override
    public String createAccount(Customer customer,double balance) {


        //setCreateDate();
       return "Current account created .";
    }

}
