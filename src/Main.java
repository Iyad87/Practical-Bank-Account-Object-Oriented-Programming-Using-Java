import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner _scn = new Scanner(System.in);
        System.out.println("Please Select Your Account Type: ");
        System.out.println("a) Credit Account");
        System.out.println("b) Savings Account");
        System.out.print("Your Choice: ");
        char choice = _scn.nextLine().charAt(0);


        switch(choice){
            case 'A':
            case 'a':
            // credit account

                break;

            case 'b':
            case 'B':
                //Savings Account

                break;
            case 'c':
            case 'C':
                System.out.println("Exit...");
                break;
            default :
                 System.out.println("Invalid Options");

        }
    }
}
