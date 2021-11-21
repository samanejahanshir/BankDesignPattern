package models;

import exceptions.NotExistException;
import models.enums.AccountType;

public class AccountFactory {
    public Account getAccountInstance(AccountType type){
        Account account=null;
        switch (type){
            case CURRENT:
                account=new CurrentAccount();
                break;
            case LONG_TERM:
                account=new LongTermAccount();
                break;
            case SHORT_TERM:
                account=new ShortTermAccount();
                break;
            default:
                throw new NotExistException("account type not founded ! ");
        }
        return  account;
    }
}
