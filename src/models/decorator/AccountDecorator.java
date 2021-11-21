package models.decorator;

import models.Account;
import models.Customer;

import javax.accessibility.Accessible;
import javax.accessibility.AccessibleContext;

public class AccountDecorator extends Account {
    private Account account;

    public AccountDecorator(Account account) {
        this.account = account;
    }


    @Override
    public String createAccount(Customer customer) {
        return null;
    }
}
