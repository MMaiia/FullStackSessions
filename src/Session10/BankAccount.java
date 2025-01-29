package Session10;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;

    }
    private void setBalance(double balance) {
        this.balance = balance;
    }
    // deposit ( > 0)
    public void deposit(double amount) {
    if (amount > 0) {
        setBalance(amount);
        System.out.println("Deposited " + amount);
    } else {
        System.out.println("Amount should be > 0");
    }
    }
    //withdraw ( positive balance, withdraw <= balance, < 0 no negative numbers)
    public void withdraw (double amount) {
        if  ( amount > 0 && amount <= balance) {
            setBalance(balance - amount);
            System.out.println("Withdrawn " + amount + " new balance:" + getBalance());
        } else {
            System.out.println("Not enough funds or amount is incorrect");
        }

    }

}

