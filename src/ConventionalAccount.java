public class ConventionalAccount extends PersonalAccount {

    public ConventionalAccount(String accNumber, double balance){
        while(balance <50){
            System.out.println("Conventional account require a minimum balance of 50 dollar..");
            System.out.print("Please re-enter the balance: ");
            balance = _scn.nextDouble();
        }
        this.balance = balance;
        this.accountNumber = accNumber;
    }

}
