public class Account {
    protected String accountNumber;
    protected double balance;
    protected String accountHolderName;

    public Account() {
        this.accountNumber = "";
        this.balance = 50;

    }

    public Account(String newAccountNumber) {
        this.accountNumber = newAccountNumber;
        this.balance = 50;
    }

    public Account(String newAccountNumber, String newAccountHolderName, double newBalance) {
        this.accountNumber = newAccountNumber;
        this.accountHolderName = newAccountHolderName;
        this.balance = newBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        return (amount < balance && (this.balance - amount) >= 50) ? true : false;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public boolean transfer(Account beneficiaryAccount, double transferAmount) {
        if (transferAmount > this.balance) {
            return false;
        } else {

            this.balance = this.balance - transferAmount;
            beneficiaryAccount.balance = beneficiaryAccount.balance + transferAmount;

            return true;
        }

    }

}
