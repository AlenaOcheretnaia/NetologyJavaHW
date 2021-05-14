package ru.netology.bankaccount;

//Кредитный не может иметь положительный баланс –
// если платить с него, то уходит в минус,
//чтобы вернуть в 0, надо пополнить его.
public class CreditAccount extends Account {

    protected CreditAccount(String accountNumber) {
        super(accountNumber, 0);
    }

    @Override
    public void pay(int amount) {
        int previousBalance = this.getBalance();
        this.setBalance(this.getBalance() - amount);
        System.out.println("Payment (" + amount + ") completed from " + this.getAccountNumber()
                + ". Previous balance is " + previousBalance + ". Current balance is " + this.getBalance());
    }

    @Override
    public void transfer(Account account, int amount) {
        int previousBalance = this.getBalance();
        this.setBalance(this.getBalance() - amount);
        System.out.println("Transfer completed from " + this.getAccountNumber()
                + " to " + account.getAccountNumber() + ". Previous balance is "
                + previousBalance + ". Current balance is " + this.getBalance());
        account.addMoney(amount);
    }

    @Override
    public boolean addMoney(int amount) {
        int previousBalance = this.getBalance();
        if ((this.getBalance() + amount) > 0) {
            System.out.println("Сannot fund the account " + this.getAccountNumber()
                    + ". Current balance is " + this.getBalance() + ". Amount (" + amount + ") exceeds the debt!");
            return false;
        } else {
            this.setBalance(this.getBalance() + amount);
            System.out.println("Amount (" + amount + ") has been successfully added to "
                    + this.getAccountNumber() + ". Previous balance is " + previousBalance + ". Current balance is " + this.getBalance());
            return true;
        }

    }
}
