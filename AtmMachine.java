import java.util.Scanner;

class BankAccount 
{
    private double balance;

    public BankAccount(double initialBalance) 
    {
        this.balance = initialBalance;
    }

    public double getBalance()
     {
        return balance;
    }

    public void deposit(double amount) 
    {
        balance += amount;
    }

    public boolean withdraw(double amount) 
    {
        if (balance >= amount)
         {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

class ATM 
{
    private BankAccount account;

    public ATM(BankAccount account) 
    {
        this.account = account;
    }

    public void start() 
    {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true)
         {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice)
             {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void checkBalance()
    {
        System.out.printf("Your balance is: $%.2f%n", account.getBalance());
    }

    private void deposit() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Deposit successful!");
    }

    private void withdraw() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount))
         {
            System.out.println("Withdrawal successful!");
        } else 
        {
            System.out.println("Insufficient balance. Please try again.");
        }
    }
}

public class AtmMachine 
{
    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount(1000.0); 
        ATM atm = new ATM(account);
        atm.start();
    }
}