import java.util.*;
class Account {
    private double Balance;
    public Account(double InitialBalance)
     {
        this.Balance = InitialBalance;
    }
    public double getBalance()
     {
        return Balance;
    }
    public boolean Withdraw(double amount) 
    {
        if (amount > 0 && amount <= Balance)
         {
            Balance -= amount;
            return true;
        } 
        else 
        {
            return false;
        }
    }
    public void Deposit(double amount)
     {
        if (amount > 0) {
            Balance += amount;
        }
    }
}
class ATM 
{
    private final Account account;
    private final Scanner scanner;
    public ATM(Account account)
     {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }
    public void start()
     {
        int choice;
        do 
        {
            display();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            Choice(choice);
        } while (choice != 4);
    }
    private void display()
    {
        System.out.println("\n--- Welcome to the ATM ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    private void Choice(int choice)
    {
        switch (choice)
        {
            case 1 -> CheckAccountBalance();
            case 2 -> Deposit();
            case 3 -> withdraw();
            case 4 -> System.out.println("Thank you for using the ATM !");
            default ->System.out.println("Invalid choice. Please enter your choice again.");
        }
    }
    private void CheckAccountBalance()
     {
        System.out.printf("Your current account balance is: %.2f\n", account.getBalance());
    }
    private void Deposit() 
    {
        System.out.print("Enter amount to deposit Rs. ");
        double Rupees = scanner.nextDouble();
        if (Rupees > 0) {
            account.Deposit(Rupees);
            System.out.printf("Deposited Successfully.\n", Rupees);
        } 
        else {
            System.out.println("Invalid amount.");
        }
    }
    private void withdraw() {
        System.out.print("Enter amount to withdraw Rs. ");
        double Rupees= scanner.nextDouble();
        if (account.Withdraw(Rupees)) {
            System.out.printf("Withdrawn successfully !!\n", Rupees);
        } 
        else {
            System.out.println("Insufficient balance");
        }
    }
}
public class ATMInterface {
    public static void main(String[] args) {
        Account Useraccount = new Account(1000.0); 
        ATM atm = new ATM(Useraccount);
        atm.start();
    }
}
