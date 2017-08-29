public class TestSAccount {

    public static void main(String[] args){
        SAccount mum = new SAccount("s123" , "Mercy Brown" , 1000.0 , 120);
        SAccount dad = new SAccount("g234" , "David Brown" , 2000.0 , 120);

        if(!mum.withdraw(100)){
            System.out.println("mum unable to withdraw");
        }

        if(!dad.transfer(mum,890)){
            System.out.println("Cannot transfer the balance, minimum amount must be at least " + dad.getMinAmount()+ ".");

        } else {
            System.out.println("Current Balance for mum : " + mum.getBalance());
            System.out.println("Current Balance for dad : " + dad.getBalance());
        }

    }
}
