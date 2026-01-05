import java.util.Scanner;
interface ATMOperations {
    void checkBalance();
    void deposit(int amount);
    void withdraw(int amount);

}
class BankAccount{
    private int Balance = 100000;

    public int getBalance(){
        return Balance;
    }

    public void depositAmount(int amount){
        Balance += amount;
    }

    public boolean withdrawAmount(int amount){
        if(amount <= Balance){
            Balance -= amount;
            return true;
        }
        return false;
    }
}
class Atm extends BankAccount implements ATMOperations{

    public void checkBalance(){
        System.out.println("current balance : Rs" + getBalance());
    }

    public void deposit(int amount){
        depositAmount(amount);
        System.out.println("Deposited Amount Successfully : RS" + amount);
    }

    public void withdraw(int amount){
       if(withdrawAmount(amount)){
        System.out.println("please collect your cash ");
       } else {System.out.println("insufficient Balance");}
        
    }
}
public class atmBackend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atm ATM = new Atm();
        int choice;

        do {
            System.out.println("\n---atm menu");
            System.out.println("1. check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Enter choice");

            choice = sc.nextInt();
            switch (choice){
                case 1:
                    ATM.checkBalance();
                    break;
                
                case 2: 
                    System.out.println("Enter Amount:");
                    ATM.deposit(sc.nextInt());
                    break;
                
                case 3:
                    System.out.println("Enter Amount");
                    ATM.withdraw(sc.nextInt());
                    break;

                case 4: 
                    System.out.println("than you for using  atm");
                    break;

                    default:
                        System.out.println("invalid option");
                }
            
            }

            
            while (choice != 4); 
                
            

        }
    }
    
