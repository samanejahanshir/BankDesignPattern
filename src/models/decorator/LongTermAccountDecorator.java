package models.decorator;

import models.Account;

public class LongTermAccountDecorator extends  AccountDecorator{
    public LongTermAccountDecorator(Account account) {
        super(account);
    }
}
