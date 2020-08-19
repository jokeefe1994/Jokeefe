package com.company;

public class Main {

    public static void main(String[] args) {

//        BankAccount jamesAccount = new BankAccount("12345", 0.00, "James O'Keefe", "Jokeefe1994@gmail.com","6469848898" );
//        System.out.println(jamesAccount.getAccountNumber());
//        System.out.println(jamesAccount.getBalance());
//
//        jamesAccount.withdrawal(100.00);
//
//        jamesAccount.deposit(50.00);
//        jamesAccount.withdrawal(100.00);
//
//        jamesAccount.deposit(51.00);
//        jamesAccount.withdrawal(100.00);
//
//        BankAccount timsAccount =  new BankAccount("Tim", "tim@gmail.com", "12345");
//        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());
//    }

        VIPCustomer customer1 = new VIPCustomer();
        System.out.println(customer1.getName());

        VIPCustomer customer2 = new VIPCustomer("Bob", 25000.00);
        System.out.println(customer2.getName());

        VIPCustomer customer3 = new VIPCustomer("James", 100.00, "jokeefe1994@gmail.com");
        System.out.println(customer3.getName());

    }
}
