import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner _scn = new Scanner(System.in);
        System.out.println("Please Select Your Account Type: ");
        System.out.println("a) Create a Personal Account");
        System.out.println("b) Withdraw Money");
        System.out.println("c) Exit");
        System.out.print("Your Choice: ");
        char choice = _scn.nextLine().charAt(0);


        switch (choice) {
            case 'A':
            case 'a':
                System.out.println("Please Select Your Account Type:");
                System.out.println("a) Saving Account");
                System.out.println("b) Current Account");
                System.out.println("c) Fixed Account");
                System.out.println("d) Conventional Account");
                System.out.println("e) Islamic Account");

                System.out.print("Your Choice: ");
                char choice2 = _scn.nextLine().charAt(0);

                // Create an Personal Account
                String accountNumber;
                double balance;
                switch (choice2) {
                    case 'a':
                    case 'A':
                        // Saving account registration
                        System.out.print("Please provide an account number: ");
                         accountNumber =  _scn.nextLine();
                        System.out.print("Please provide a new balance: ");
                       balance = _scn.nextDouble();
                        SavingAccount account = new SavingAccount(accountNumber,balance);
                        System.out.println("Saving Account Number: " + account.getAccountNumber());
                        System.out.println("Saving Account Balance: " + account.getBalance());
                        break;

                    case 'b':
                    case 'B':
//                    Current Account Registration
                        System.out.print("Please provide an account number: ");
                        accountNumber = _scn.nextLine();
                        System.out.print("Please provide a new balance: ");
                         balance = _scn.nextDouble();
                        CurrentAccount account2 = new CurrentAccount(accountNumber,balance);
                        System.out.println("Current Account Number: " + account2.getAccountNumber());
                        System.out.println("Current Account Balance: " + account2.getBalance());
                        break;
                    case 'c':
                    case 'C':
                        //Fixed Deposit Registration
                        System.out.print("Please provide an account number: ");
                        accountNumber = _scn.nextLine();
                        System.out.print("Please provide a new balance: ");
                        balance = _scn.nextDouble();
                        FixedDeposit account3 = new FixedDeposit(accountNumber,balance);

                        break;
                    case 'd':
                    case 'D':
                        System.out.print("Please provide an account number: ");
                        accountNumber =  _scn.nextLine();
                        System.out.print("Please provide a new balance: ");
                        balance = _scn.nextDouble();
                        ConventionalAccount account4 = new ConventionalAccount(accountNumber,balance);
                        System.out.println("Conventional Account Number: " + account4.getAccountNumber());
                        System.out.println("Conventional Account Balance: " + account4.getBalance());
                        break;
                    case 'e':
                    case 'E':
                        System.out.print("Please provide an account number: ");
                        accountNumber = _scn.nextLine();
                        System.out.print("Please provide a new balance: ");
                        balance = _scn.nextDouble();
                        IslamicAccount account5 = new IslamicAccount(accountNumber,balance);
                        System.out.println("Islamic Account Number: " + account5.getAccountNumber());
                        System.out.println("Islamic Account Balance: " + account5.getBalance());
                        break;
                }
                break;

            case 'b':
            case 'B':
                // Withdraw money


                break;
            case 'c':
            case 'C':
                System.out.println("Exit...");
                break;
            default:
                System.out.println("Invalid Options");

        }
    }
}
