package ru.netology.bankaccount;

public abstract class Account {
    private int balance;
    private String accountNumber;

    public Account(String accountNumber, int amount) {
        this.setBalance(amount);
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int amount) {
        this.balance = amount;
    }

    public void pay(int amount) {
        this.setBalance(this.getBalance() - amount);
    }

    public void transfer(Account account, int amount) {
        account.setBalance(account.getBalance() + amount);
        this.setBalance(this.getBalance() - amount);
    }

    public boolean addMoney(int amount) {
        this.setBalance(this.getBalance() + amount);
        return true;
    }
}
