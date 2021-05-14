package ru.netology.bankaccount;

//Расчетный может выполнять все три операции, но не может уходить в минус.
public class CheckingAccount extends Account {
    private String type = "checking";

    protected CheckingAccount(String accountNumber, int balance) {
        super(accountNumber, balance);
    }

    @Override
    public void pay(int amount) {
        int previousBalance = this.getBalance();
        if ((this.getBalance() - amount) < 0) {
            System.out.println("You cannot pay this amount (" + amount + ") from "
                    + this.getAccountNumber() + ", there is not enough funds. Current balance is " + this.getBalance());
        } else {
            this.setBalance(this.getBalance() - amount);
            System.out.println("Payment (" + amount + ") completed from " + this.getAccountNumber()
                    + ". Previous balance is " + previousBalance + ". Current balance is " + this.getBalance());
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if ((this.getBalance() - amount) < 0) {
            System.out.println("You cannot transfer this amount (" + amount + "), there is not enough funds! Current balance is " + this.getBalance());
        } else {
            if (account.addMoney(amount)) {
                int previousBalance = this.getBalance();
                this.setBalance(this.getBalance() - amount);
                System.out.println("Transfer completed from " + this.getAccountNumber()
                        + " to " + account.getAccountNumber() + ". Previous balance is "
                        + previousBalance + ". Current balance is " + this.getBalance());
                account.addMoney(amount);
            } else {
                System.out.println("You cannot transfer this amount (" + amount + ") to " + account.getAccountNumber() + " which balance is " + account.getBalance());
            }
        }
    }

    @Override
    public boolean addMoney(int amount) {
        this.setBalance(this.getBalance() + amount);
        System.out.println("Account " + this.getAccountNumber()
                + " replenished by " + amount + ". Сurrent balance is " + this.getBalance());
        return true;
    }
}
