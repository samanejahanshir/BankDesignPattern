package models.decorator;

import models.Account;

public class CurrentAccountDecorator extends AccountDecorator{
    public CurrentAccountDecorator(Account account) {
        super(account);
    }
}
