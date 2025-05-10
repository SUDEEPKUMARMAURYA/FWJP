/* Lab 6
  	2.Write a Java program to simulate a simple banking application.
		Create a class BankAccount with a balance and methods for deposit and withdrawal.
		Implement exception handling for withdrawal operations to prevent overdrawing.
		Handle the scenario when the withdrawal amount is greater than the balance. 
 */




import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Available balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        
        BankAccount account = new BankAccount(initialBalance);
        
        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Show Balance\n4.Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double amount = scanner.nextDouble();
                account.deposit(amount);
            } else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double amount = scanner.nextDouble();
                try {
                    account.withdraw(amount);
                } catch (InsufficientFundsException e) {
                    System.out.println("Exception: " + e.getMessage());
                }
            } else if (choice == 3) {
                System.out.println("Final Balance: " + account.getBalance());
                break;
            } 
            else if(choice == 4){
            	System.out.println("Exiting...");
            }
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        
       
    }
}

