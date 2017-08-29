public class SAccount extends Account{
    private double minimumAmount;

    public SAccount(String newaccountNum, String newAccountHolderName, double newBalance, double minimumAmount){
        this.accountNumber = newaccountNum;
        this.accountHolderName = newAccountHolderName;
        this.balance  = newBalance;
        this.minimumAmount = minimumAmount;
    }
    public boolean transfer(Account beneficiaryAccount, double transferAmount) {
        if (transferAmount < balance && (balance - transferAmount) > getMinAmount()) {

            this.balance = this.balance - transferAmount;
            beneficiaryAccount.balance = beneficiaryAccount.balance + transferAmount;

            return true;
        } else {
            return false;

        }

    }

    public void deposit(double amount) {

        this.balance = this.balance + amount;
    }


    public double getMinAmount(){
        return minimumAmount;
    }
    public String getAccountName(){
        return  accountHolderName;
    }
    public double getBalance(){
        return  balance;
    }
}
