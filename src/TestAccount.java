public class TestAccount {

    public static void main(String[] args){
        Account mum = new Account("s123" , "Mercy Brown" , 1000.0);
        Account dad = new Account("g234" , "David Brown" , 2000.0);

        if(!mum.withdraw(100)){
            System.out.println("mum unable to withdraw");
        }

        dad.deposit(150);
        dad.transfer(mum,500);
        System.out.println("Current Balance for mum : " + mum.getBalance());
        System.out.println("Current Balance for dad : " + dad.getBalance());

    }
}
