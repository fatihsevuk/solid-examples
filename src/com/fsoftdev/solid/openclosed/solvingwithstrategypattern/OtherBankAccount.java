package com.fsoftdev.solid.openclosed.solvingwithstrategypattern;

public class OtherBankAccount implements MoneyTransferProc {


    @Override
    public void transferMoney(double amount) {

        System.out.println("Other Transfer Completed: " + amount + " Euro");

    }
}
