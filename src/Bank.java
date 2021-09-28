import java.util.ArrayList;

public class Bank {
    //scope type  a name
    private String name;

    //scope ------- type ---------  name
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public void addAccount(BankAccount newAccount) {
        bankAccounts.add(newAccount);
    }

    public double totalValue() {

        // local variable
        double totalValue = 0;

        //type in the list  name : collection
        for(BankAccount currentBankAccount : bankAccounts) {
            totalValue = totalValue + currentBankAccount.getBalance();
        }
        return totalValue;
    }

}
