package models.decorator;

import models.Account;

public class ShortTermAccountDecorator extends  AccountDecorator {

    public ShortTermAccountDecorator(Account account) {
        super(account);
    }
}
