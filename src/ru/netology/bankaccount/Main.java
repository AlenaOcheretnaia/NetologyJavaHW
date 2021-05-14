package ru.netology.bankaccount;

public class Main {

    public static void main(String args[]) {
        Account mySavings = new SavingsAccount("mySavings001", 500);
        Account myCredit = new CreditAccount("myCredit001");
        Account myChecking = new CheckingAccount("myChecking001", 100);

        System.out.println("Savings account:");
        mySavings.pay(200);
        mySavings.addMoney(200);
        mySavings.transfer(myChecking, 300);

        System.out.println("\nCredit account:");
        myCredit.pay(200);
        myCredit.addMoney(300);
        myCredit.addMoney(150);
        myCredit.transfer(myChecking, 300);

        System.out.println("\nChecking account:");
        myChecking.pay(200);
        myChecking.addMoney(300);
        myChecking.pay(200);
        myChecking.transfer(mySavings, 100);
        myChecking.transfer(myCredit, 500);
    }
}
