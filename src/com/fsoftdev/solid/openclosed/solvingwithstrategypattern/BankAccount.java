package com.fsoftdev.solid.openclosed.solvingwithstrategypattern;

public class BankAccount implements MoneyTransferProc{


    @Override
    public void transferMoney(double amount) {
        System.out.println("Local Transfer Completed: " + amount + " Euro");

    }
}
