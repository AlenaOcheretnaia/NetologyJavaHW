package ru.netology.bankaccount;

//Со сберегательного счета нельзя платить, только переводить и пополнять.
//Также сберегательный не может уходить в минус.
public class SavingsAccount extends Account {

    protected SavingsAccount(String accountNumber, int balance) {
        super(accountNumber, balance);
    }

    @Override
    public void pay(int amount) {
        System.out.println("You cannot pay with a Savings account " + this.getAccountNumber());
    }

    @Override
    public void transfer(Account account, int amount) {
        if ((this.getBalance() - amount) < 0) {
            System.out.println("You cannot transfer this amount, there is not enough funds on " + this.getAccountNumber());
        } else {
            int previousBalance = this.getBalance();
            this.setBalance(this.getBalance() - amount);
            System.out.println("Transfer completed from " + this.getAccountNumber()
                    + " to " + account.getAccountNumber() + ". Previous balance is "
                    + previousBalance + ". Current balance is " + this.getBalance());
            account.addMoney(amount);
        }
    }

    @Override
    public boolean addMoney(int amount) {
        this.setBalance(this.getBalance() + amount);
        System.out.println("Account " + this.getAccountNumber()
                + " replenished by " + amount + ". Current balance is " + this.getBalance());
        return true;
    }
}
