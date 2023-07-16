package bankAccountApp;

public abstract class Account implements Interest {

    //List common properties for savings and checking accounts
   private String name;
    private String sSN;
    private double balance;

    private static int index = 10000;
   protected String accountNumber;
    protected double rate;

    //constructor to set base properties and initialize the account
    public Account(String name,String sSN, double initialDeposit){
        this.name= name;
        this.sSN=sSN;
        balance=initialDeposit;

        // System.out.println("Name: "+name+" SSN: "+sSN+" Balance: $ "+balance);

        //set account number
        index ++;
        this.accountNumber=setAccountNum();

        // System.out.println("Account Number "+ this.accountNumber);
        // System.out.println(getBaseRate());

        setRate();

    }

    public abstract void setRate();

    private String setAccountNum(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random()*Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID +randomNumber;

    }


    public void compound(){
        double accuredInterest = balance * (rate/100);
        balance=balance+accuredInterest;
        System.out.println("Accured Interest: $"+accuredInterest);
    }

    //list common methods
    public void deposit(double amount){
        balance=balance+amount;
        System.out.println("Depositing $"+amount);
        printBalance();

    }
    public void withdraw(double amount){
        balance=balance-amount;
        System.out.println("Withdrawing $"+amount);
        printBalance();

    }
    public void transfer(String toWhere,double amount){
        balance=balance-amount;
        System.out.println("Transfering $"+ amount+" to "+toWhere);
        printBalance();

    }
    public void printBalance(){
        System.out.println("Your Balance is now: $"+balance);

    }


    public void showInfo(){
        System.out.println(
            "Name: "+name+
            "\nAccount Number: "+ accountNumber+
            "\nBalance: "+ balance+
            "\nRate: "+rate+"%"
        );
    }
    
}
