package models;

import exceptions.NotExistException;
import models.enums.AccountType;

public class AccountFactory {
    public Account getAccountInstance(Customer customer,AccountType type){
        Account account=null;
        switch (type){
            case CURRENT:
                account=new CurrentAccount(customer.getFirstName(),customer.getLastName(),customer.getNationalCode(),AccountType.CURRENT.name());
                break;
            case LONG_TERM:
                account=new LongTermAccount(customer.getFirstName(),customer.getLastName(),customer.getNationalCode(),AccountType.LONG_TERM.name());
                break;
            case SHORT_TERM:
                account=new ShortTermAccount(customer.getFirstName(),customer.getLastName(),customer.getNationalCode(),AccountType.SHORT_TERM.name());
                break;
            default:
                throw new NotExistException("account type not founded ! ");
        }
        return  account;
    }
}
