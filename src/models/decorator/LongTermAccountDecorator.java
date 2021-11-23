package models.decorator;

import models.Account;
import models.Customer;
import models.LongTermAccount;

public class LongTermAccountDecorator extends  AccountDecorator{
    LongTermAccount longTermAccount;
    public LongTermAccountDecorator(Account account) {
        super(account);
        longTermAccount=(LongTermAccount) account;
    }

    @Override
    public String createAccount(Customer customer, double balance) {
        if(balance>=100000) {
           setBalance(balance);
            return  longTermAccount.createAccount(customer,balance)+" => id account : "+ getId();
        }
        throw new RuntimeException(customer.getFirstName()+ " "+customer.getLastName()+" "+ "balance < 100000 !  please deposit more than 100000");
    }
}
