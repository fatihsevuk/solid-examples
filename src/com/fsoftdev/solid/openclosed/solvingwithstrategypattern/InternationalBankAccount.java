package com.fsoftdev.solid.openclosed.solvingwithstrategypattern;

import com.fsoftdev.solid.openclosed.solvingwithinheritance.BankAccount;

public class InternationalBankAccount implements MoneyTransferProc {


    @Override
    public void transferMoney(double amount) {
        System.out.println("International Transfer Completed: " + amount + " Euro");
    }
}
