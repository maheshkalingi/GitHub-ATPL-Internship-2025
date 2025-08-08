public class BankAccount{
    double balance;
    BankAccount(double amount){
        this.balance=amount;
    }
    public void deposit(double amount){
     balance+=amount;
     System.out.println("your  amount "+amount+" Deposited successfully!");
    }
   public void withdraw(double amount){
     balance-=amount;
     System.out.println("your  amount "+amount+" Withdrawed  successfully!");
   }
   public void checkBalance(){
    System.out.println("Your Balance is: "+balance);
   }

}
class Two{
    public static void main(String[] args){
        BankAccount b1= new BankAccount(2000);
        BankAccount b2= new BankAccount(1000);
        BankAccount b3= new BankAccount(20000);
        b1.deposit(500000);
        b1.withdraw(20000);
        b1.checkBalance();
        b2.deposit(300000);
        b2.withdraw(10000);
        b2.checkBalance();
        b3.deposit(1200000);
        b3.withdraw(700000);
        b3.checkBalance();
    }
}