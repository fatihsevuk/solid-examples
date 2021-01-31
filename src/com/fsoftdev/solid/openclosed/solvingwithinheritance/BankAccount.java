package com.fsoftdev.solid.openclosed.solvingwithinheritance;

public class BankAccount {

    void transferMoney(double amount) {
        // local transfer

        //  we consider to want to add international transfer

        // without ocp we add conditional logic for int. transfer in this method

        // with ocp we  can use inheritance or strategy design pattern for adding new feature


    }
}
