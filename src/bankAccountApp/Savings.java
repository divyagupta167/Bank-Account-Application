package bankAccountApp;

public class Savings extends Account {

   
    //list the properties specific to the savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // constructor to initialize settings for the savings properties
     public Savings(String name, String sSN, double initialDeposit) {
        super(name,sSN,initialDeposit);
        accountNumber= "1"+accountNumber;
        setSafetyDepositBox();



        // System.out.println("Account Number "+ this.accountNumber);
        // System.out.println("New Savings Account");
       
        
    }
    @Override
    public void setRate() {
        // System.out.println("Unimplemented method 'setRate'");
        rate = getBaseRate() - 0.25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID= (int)(Math.random()*Math.pow(10, 3));
        // System.out.println(safetyDepositBoxID);
        safetyDepositBoxKey=(int)(Math.random()*Math.pow(10, 4));
    }

    // list any methods specific to savings account
    public void showInfo(){
        System.out.println("Account type: Savings");
        super.showInfo();
        System.out.println(
            "Your Savings Account Features "+
            "\nSafety Deposit Box ID: "+safetyDepositBoxID+
            "\nSafety Deposit Box key: "+safetyDepositBoxKey
        );
    }

    
    
}
