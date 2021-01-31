package com.fsoftdev.solid.openclosed.solvingwithstrategypattern;


public class MoneyTransferProcessorFactory {

    public static MoneyTransferProc bulid(TransferType type) {

        if(type==TransferType.LOCAL) {
            return new BankAccount();
        } else if(type==TransferType.INTERNATIOAL) {
            return new InternationalBankAccount();
        }else {
            return new OtherBankAccount();
        }

    }

}
