package bankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
List<Account> accounts = new LinkedList<Account>();

        // read a csv file then create new accounts based on that data
        String file = "C:\\Users\\Divya\\Desktop\\projects\\JAVA\\Bank Account Application\\src\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for(String[] accountHolder : newAccountHolders){
           
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initialDeposit = Double.parseDouble(accountHolder[3]);
           
        //    System.out.println(name+" "+sSN+" "+accountType+"  $"+initialDeposit);

           if (accountType.equals("Savings")) {
            System.out.println("OPEN A SAVINNGS ACCOUNT");
            accounts.add(new Savings(name, sSN, initialDeposit));

            
           } else if(accountType.equals("Checking")){
             System.out.println("OPEN A CHECKINGS ACCOUNT");

             accounts.add(new Checking(name, sSN, initialDeposit));
           }else{
             System.out.println("ERROR READINNG ACCOUNT TYPE");
           }
          
        }
        
        
        for(Account acc: accounts){
            System.out.println("\n************************");
                acc.showInfo();


        }

    }
    
}
