package view;

import exceptions.NotExistException;
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
        Customer mohammad=Customer.CustomerBuilder.aCustomer()
                .withFirstName("Mohammad")
                .withLastName("Mohammadi")
                .withNationalCode("4567890987")
                .build();
        Customer ali=Customer.CustomerBuilder.aCustomer()
                .withFirstName("Ali")
                .withLastName("Hoseini")
                .withNationalCode("4567654342")
                .build();
        Account aliAccount=new AccountFactory().getAccountInstance(ali,AccountType.SHORT_TERM);
        Account mohammadAccount=new AccountFactory().getAccountInstance(mohammad,AccountType.CURRENT);
        aliAccount=new ShortTermAccountDecorator(aliAccount);
        mohammadAccount=new CurrentAccountDecorator(mohammadAccount);
        try {
            System.out.println(aliAccount.createAccount(ali, 60000));
        }catch (RuntimeException e){
            System.out.println( e.getMessage());
        }
        try {
            System.out.println(mohammadAccount.createAccount(mohammad, 100000));
        }catch (RuntimeException e){
            System.out.println( e.getMessage());
        }
        ali.setAccounts(List.of(aliAccount));
        ali.setCustomerId(aliAccount.getCustomerNCode());
        mohammad.setAccounts(List.of(mohammadAccount));
        mohammad.setCustomerId(mohammadAccount.getCustomerNCode());
        System.out.println(ali);
        System.out.println(mohammad);

    }
}
