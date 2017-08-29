public class SavingAccount extends PersonalAccount {

    private double interest;
    public SavingAccount(String accNumber, double balance){
        while(balance <50){
            System.out.println("Saving account require a minimum balance of 50 dollar..");
            System.out.print("Please re-enter the balance: ");
            balance = _scn.nextDouble();
        }
        this.balance = balance;
        this.accountNumber = accNumber;
    }
    public void addInterest(double interestRate) {
         setInterest( (getBalance() * interestRate) );

        this.balance = getBalance() + interest;
    }

    public  void  setInterest(double newInterest){
        this.interest = newInterest;
    }

    public double getInterest(){
        return interest;
    }
}
