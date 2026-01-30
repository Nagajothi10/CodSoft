import java.util.Scanner;
class BankAccount {
    private int  balance;
    BankAccount(int balance){
        this.balance=balance;
    
    }
    int getBalance() {
        return balance;
    }
    void deposit(int amount) {
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit Successfully");
        }
       
        else{
            System.out.println("Invalid amount");
        }
    }
    
    void withdraw(int amount){
        if(amount>0){
            if(amount<=balance){
                balance-=amount;
                System.out.println("Withdraw Successfully");

            }
            else{
                System.out.println("Insufficient balance");
            }
        }
        else{
            System.out.println("Invalid amount");
        }
    }
   
}
class ATMInterface {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        BankAccount obj = new BankAccount(5000);
        while(true){
            System.out.println("Welcome to ATM");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
        
           System.out.println("Enter your choice: ");
           int choice = sc.nextInt();

           switch(choice){
               case 1:
                System.out.println("Enter amount: ");
                int depamount = sc.nextInt();
                obj.deposit(depamount);
                break;
               case 2: 
               System.out.println("Enter amount: ");
               int drawamount = sc.nextInt();
               obj.withdraw(drawamount);
               break;
              case 3: 
                System.out.println("Current Balance: "+obj.getBalance());
                break;
              case 4: 
                System.out.println("Thank you for using ATM");
                sc.close();
                return;
              default:
                System.out.println("Invalid choice");
            }
        }        
    }
}