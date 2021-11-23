package models.decorator;

import models.Account;
import models.Customer;

import javax.accessibility.Accessible;
import javax.accessibility.AccessibleContext;

public class AccountDecorator extends Account {
    private Account account;

    public AccountDecorator(Account account) {
        super(account.getCustomerName(),account.getCustomerLastName(),account.getCustomerNCode(),account.getType());
        this.account = account;
    }


    @Override
    public String createAccount(Customer customer,double balance) {
        return account.createAccount(customer,balance);


    }
}
