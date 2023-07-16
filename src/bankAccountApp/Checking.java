package bankAccountApp;

public class Checking  extends Account{
    //List properties specific to a checking account
    private int debitCardNumber;
    private int debitCardPin;

    //constructor to initialize checking account properties
    public Checking(String name,String sSN, double initialDeposit){
        super(name,sSN,initialDeposit);
        accountNumber= "2"+accountNumber;
        setDebitCard();


        // System.out.println("Account Number "+ this.accountNumber);
        // System.out.println("New checking account");
       
    }
    
    public void setRate() {
    //    System.out.println("Unimplemented method 'setRate'");
    rate=getBaseRate()*0.15;
    }

    private void setDebitCard() {
        debitCardNumber=(int)(Math.random()*Math.pow(10, 3));
        debitCardPin=(int)(Math.random()*Math.pow(10, 4));
    }

    // list any methods spedific to the checking account
    public void showInfo(){
        System.out.println("Account type: Checking");
        super.showInfo();
        System.out.println(
            "Your Savings Account Features "+
            "\nYour Debit card Number: "+debitCardNumber+
            "\nYour Debit card Pin: "+debitCardPin
        );
    }

   
    
}
