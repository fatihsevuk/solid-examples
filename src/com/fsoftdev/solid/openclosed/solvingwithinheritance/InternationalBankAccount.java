package com.fsoftdev.solid.openclosed.solvingwithinheritance;

public class InternationalBankAccount extends BankAccount {


    @Override
    void transferMoney(double amount) {
        // business logic for international transfer

        // Here,  we solved problem but we have a little problem,
        // our InternationalBankAccount class depends with BankAccount class
        // if we make change in BankAccount ,then InternationBankAccount will be affected.
        // This occured coupling.

        // well then how will we fix? Strategy Pattern



    }
}
