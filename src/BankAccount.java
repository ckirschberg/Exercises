public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        //this.balance = this.balance + depositAmount;
        this.balance += depositAmount;
    }
    public void withdraw(double withdrawAmount) {
        this.balance = this.balance - withdrawAmount;
        //this.balance -= withdrawAmount;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }
}
