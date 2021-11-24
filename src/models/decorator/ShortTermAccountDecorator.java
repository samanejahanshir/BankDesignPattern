package models.decorator;

import models.Account;
import models.Customer;
import models.ShortTermAccount;

public class ShortTermAccountDecorator extends AccountDecorator {
    ShortTermAccount shortTermAccount;

    public ShortTermAccountDecorator(Account account) {
        super(account);
        shortTermAccount=(ShortTermAccount) account;
    }

    @Override
    public String createAccount(Customer customer,double balance) {
        if(balance>=50000) {
            setBalance(balance);
            setProfit(calculateProfit(balance));
            return shortTermAccount.createAccount(customer,balance)+" => id account: " + getId();
        }
        setCustomerNCode(null);
        setId(null);
        setCustomerLastName(null);
        setCustomerName(null);
        throw new RuntimeException(customer.getFirstName()+ " "+customer.getLastName()+" "+ "balance < 50000 ! please deposit more than 50000 ");



    }
    public double calculateProfit(double balance){
        return  0.10*balance;
    }
}
