package models.decorator;

import models.Account;
import models.CurrentAccount;
import models.Customer;

import java.util.Date;

public class CurrentAccountDecorator extends AccountDecorator {
    CurrentAccount currentAccount;

    public CurrentAccountDecorator(Account account) {
        super(account);
        currentAccount = (CurrentAccount) account;
    }

    @Override
    public String createAccount(Customer customer, double balance) {
        if (balance >= 100000) {
            setBalance(balance);
            return currentAccount.createAccount(customer, balance) + " => id account : " + getId() + "  " + createCheck(customer);
        }
        setCustomerNCode(null);
        setId(null);
        setCustomerLastName(null);
        setCustomerName(null);
        throw new RuntimeException(customer.getFirstName() + " " + customer.getLastName() + " " + "balance < 100000 !  please deposit more than 100000");


    }

    public String createCheck(Customer customer) {
        return "and can to want a check for " + customer.getFirstName() + " " + customer.getLastName();
    }
}
