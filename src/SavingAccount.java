public class SavingAccount extends Account {

    private double interest;

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
