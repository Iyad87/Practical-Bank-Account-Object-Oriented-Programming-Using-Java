

public class IslamicAccount extends PersonalAccount {
    public IslamicAccount(String accNumber, double balance){
        while(balance <50){
            System.out.println("Islamic account require a minimum balance of 50 dollar..");
            System.out.print("Please re-enter the balance: ");
            balance = _scn.nextDouble();
        }
        this.balance = balance;
        this.accountNumber = accNumber;
    }
}
