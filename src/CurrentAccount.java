public class CurrentAccount extends PersonalAccount{
    public CurrentAccount(int accNumber, double balance){
        while(balance <0){
            System.out.println("Current account balance cannot be negative");
            System.out.print("Please re-enter the balance: ");
            balance = _scn.nextDouble();
        }
        this.balance = balance;
        this.accountNumber = accNumber;
    }
}
