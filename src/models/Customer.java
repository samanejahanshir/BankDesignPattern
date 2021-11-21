package models;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private  String firstName;
    private  String lastName;
    private  String nationalCode;
    private String customerId;
    private List<Account> accounts=new ArrayList<>();

    public static final class CustomerBuilder {
        private  String firstName;
        private  String lastName;
        private  String nationalCode;
        private String customerId;
        private List<Account> accounts;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getNationalCode() {
            return nationalCode;
        }

        public String getCustomerId() {
            return customerId;
        }

        public List<Account> getAccounts() {
            return accounts;
        }

        private CustomerBuilder() {
        }

        public static CustomerBuilder aCustomer() {
            return new CustomerBuilder();
        }

        public CustomerBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public CustomerBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public CustomerBuilder withNationalCode(String nationalCode) {
            this.nationalCode = nationalCode;
            return this;
        }

        public CustomerBuilder withCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public CustomerBuilder withAccounts(List<Account> accounts) {
            this.accounts = accounts;
            return this;
        }

        public Customer build() {
            Customer customer = new Customer();
            customer.accounts = this.accounts;
            customer.customerId = this.customerId;
            customer.firstName = this.firstName;
            customer.nationalCode = this.nationalCode;
            customer.lastName = this.lastName;
            return customer;
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", customerId='" + customerId + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
