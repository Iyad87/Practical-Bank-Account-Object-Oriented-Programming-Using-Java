public class FixedDeposit extends PersonalAccount{
    public FixedDeposit(String accNumber, double balance){
        while(balance < 500){
            System.out.println("Fixed Deposit account require a minimum balance of 500 dollar..");
            System.out.print("Please re-enter the balance: ");
            balance = _scn.nextDouble();
        }
        this.balance = balance;
        this.accountNumber = accNumber;
    }
}
