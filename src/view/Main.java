package view;

import models.Account;
import models.AccountFactory;
import models.CurrentAccount;
import models.Customer;
import models.decorator.CurrentAccountDecorator;
import models.decorator.ShortTermAccountDecorator;
import models.enums.AccountType;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account aliAccount=new AccountFactory().getAccountInstance(AccountType.SHORT_TERM);
        Account mohammadAccount=new AccountFactory().getAccountInstance(AccountType.CURRENT);
        aliAccount=new ShortTermAccountDecorator(aliAccount);
        mohammadAccount=new CurrentAccountDecorator(mohammadAccount);
        Customer mohammad=Customer.CustomerBuilder.aCustomer()
                .withFirstName("Mohammad")
                .withLastName("Mohammadi")
                .withNationalCode("4567890987")
                .withCustomerId("123")
                .withAccounts(List.of(mohammadAccount))
                .build();
        Customer ali=Customer.CustomerBuilder.aCustomer()
                .withFirstName("Ali")
                .withLastName("Hoseini")
                .withNationalCode("4567654342")
                .withCustomerId("153")
                .withAccounts(List.of(aliAccount))
                .build();
        System.out.println(ali);
        System.out.println(mohammad);

    }
}
