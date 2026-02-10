package Level2.Encapsulation;
public class BankAccount {
    private double balance;
    
    public double deposit(double amount){
        balance = balance+amount;
        return balance;
    }
    public double withdraw(double amount){
        
        if(amount<=balance){
            balance=balance-amount;
            return balance; 
        }
        else{
            System.out.println("Insufficient Balance");
        }
        return 0;
    }
    public double getbalance() {
        return balance;

    }
   
    public static void main(String[] args) {
        
        BankAccount b=new BankAccount();
        b.balance=50000;
        System.out.println("\nDeposited tk.Balance : "+b.deposit(40000));
        System.out.println("\nWithdraw Complitted .Balance :"+b.withdraw(3000));
        System.out.println("\nYou current Balance is: "+b.getbalance());
    }
    
}
