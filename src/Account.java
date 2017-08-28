public class Account {
    protected int accountNumber;
    protected double balance;
    public Account(){
        this.accountNumber = 0;
        this.balance = 50;

    }

    public Account(int newAccountNumber){
        this.accountNumber = newAccountNumber;
        this.balance = 50;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
  public boolean withdraw(double amount){
    return  (amount <= balance)?true : false;
  }
  public void deposit(double amount){

  }
  public void setBalance(double newBalance){
      this.balance = newBalance;
  }
}
