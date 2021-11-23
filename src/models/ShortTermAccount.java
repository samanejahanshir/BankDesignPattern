package models;

import java.util.Random;

public class ShortTermAccount extends Account {

    public ShortTermAccount(String customerName, String customerLastName, String customerNCode, String type) {
        super(customerName, customerLastName, customerNCode, type);
    }

    @Override
    public String createAccount(Customer customer, double balance) {


        return " Short term account create ";
    }
}
