package BankAtm;
import java.util.*;
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}
 public class Bank{
    double amount;
    Bank(double Amount){
      this.amount=Amount;
    }
    public void deposit(double depamount){
        amount+=depamount;
        System.out.println(depamount +" Amount Deposited Successfully!");
    }
    public void Withdraw(double withdAmount) throws InsufficientBalanceException{
        if(withdAmount > amount){
            throw new InsufficientBalanceException("InSufficient Funds In your Account,Please add Some Funds.....!");
        }
        else{
              amount-=withdAmount;
              System.out.println(withdAmount +" Amount Debited Successfully!");
           }

    }
    public void getBalance(){
        System.out.println("Balance Fetched Sucessfully: "+amount);
    }
 }
 class ATMTest{
    public static void main(String[] args){
        Bank b= new  Bank(0);
        Scanner sc= new Scanner(System.in);
      boolean ans=true;
      while(ans){
        System.out.println("1.totalBalance\n2:withdraw\n3:deposit\n4.Exit");
        int option=sc.nextInt();
        System.out.println();
      switch(option){
          case 1:
                b.getBalance();
                break;
          case 2:
                System.out.println("Enter Amount to Withdraw:");
                double amt=sc.nextDouble();
                try{
                    b.Withdraw(amt);
                }
                catch(InsufficientBalanceException e){
                    System.out.println(e);
                }
                
                break;
         case 3:
              System.out.println("Enter Amount to Deposit:");
                double deamt =sc.nextDouble();
                b.deposit(deamt);
                break;

        case 4:
             System.out.println("Are You Want To Exit ? Yes / No");
             String Ans=sc.next();
             if(Ans.equals("Yes")){
                ans=false;
             }else{
                ans=true;
             }
             break;
        default:
               System.out.println("Invalid Operation Occured.");   
               break;

      }
      
    }
      sc.close();
    }
    
 }