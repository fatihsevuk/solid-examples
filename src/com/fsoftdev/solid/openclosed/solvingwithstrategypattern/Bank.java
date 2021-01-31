package com.fsoftdev.solid.openclosed.solvingwithstrategypattern;

public class Bank {
    public static void main(String[] args) {
        processPayment(234.5 , TransferType.OTHER);
    }

    private static void processPayment(double amount, TransferType type) {
        MoneyTransferProc moneyTransferProc= MoneyTransferProcessorFactory.bulid(type);
        moneyTransferProc.transferMoney(amount);
    }
}
