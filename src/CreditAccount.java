import com.sun.deploy.security.CredentialInfo;

import java.util.Date;

public class CreditAccount extends  Account {

    protected double creditLimit = 0.0F;
    protected double interest = 0.0F;
    protected Date  dueDate = new Date();
    protected double outstanding = 0;
    public CreditAccount(int accountNum , double creditLimit, double interest){
       super(accountNum , 0);
       this.creditLimit = creditLimit;
       this.interest = interest;
    }
//    public double calculatePayment(){
//
//    }
    public void chargeInterest(){
        setBalance(getBalance() + (getBalance() * (interest / 12)));
    }

    public void deposit(double amount){
        setBalance(getBalance() - amount);
        outstanding -= amount;

        if(outstanding <0){
            outstanding = 0;
        }

    }


}
