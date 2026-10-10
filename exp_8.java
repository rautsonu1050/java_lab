import java.util.Scanner;
import java.util.InputMismatchException;


class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }


    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        }
        else if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance! Withdrawal denied."
            );
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);
        }
    }
}


public class exp_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter initial account balance: ");
            double balance = sc.nextDouble();

            BankAccount account = new BankAccount(balance);

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);
        }

        catch (InputMismatchException e) {
            System.out.println(
                "Error: Please enter a valid numeric input."
            );
        }

        catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Transaction completed.");
            sc.close();
        }
    }
}

