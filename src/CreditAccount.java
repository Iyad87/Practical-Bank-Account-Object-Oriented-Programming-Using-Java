
import java.util.Date;

public class CreditAccount extends Account {

    private double creditLimit = 1000.0F;
    private double interest = 0.0F;
    private Date dueDate = new Date();
    private double outstanding = 0;

    public CreditAccount(String accountNum, double interest) {
        super(accountNum);
        this.creditLimit = 1000.00F;
        this.interest = interest;
    }

    /**    public double calculatePayment(){

  } **/
    public void chargeInterest() {
        setBalance(getBalance() + (getBalance() * (interest / 12)));
    }

    public void deposit(double amount) {
        setBalance(getBalance() - amount);
        outstanding -= amount;

        if (outstanding < 0) {
            outstanding = 0;
        }

    }
    public boolean withdraw(double amount){
//        return  (amount > balance)?false : true;

        if(amount < getBalance() && getBalance() >=50 && getBalance() <=creditLimit){
            return true;
        } else {
            return false;
        }
    }


}
