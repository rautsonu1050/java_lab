class Account {
    String accountName;
    int accountNumber;

    Account(String accountName, int accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    void displayAccountDetails() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
    }
}
class SavingAccount extends Account {
    SavingAccount(String accountName, int accountNumber) {
        super(accountName, accountNumber);
    }

    void displaySavingAccount() {
        System.out.println("Account Type: Saving Account");
        displayAccountDetails();
    }
}
class CurrentAccount extends Account {
    CurrentAccount(String accountName, int accountNumber) {
        super(accountName, accountNumber);
    }

    void displayCurrentAccount() {
        System.out.println("Account Type: Current Account");
        displayAccountDetails();
    }
}

class PremiumSavingAccount extends SavingAccount {
    PremiumSavingAccount(String accountName, int accountNumber) {
        super(accountName, accountNumber);
    }

    void displayPremiumSavingAccount() {
        System.out.println("Account Type: Premium Saving Account");
        displayAccountDetails();
    }
}

public class exp_4 {
    public static void main(String[] args) {
        SavingAccount saving = new SavingAccount("Sonu", 1001);
        CurrentAccount current = new CurrentAccount("Ram", 1002);
        PremiumSavingAccount premium = new PremiumSavingAccount("Mohan", 1003);

        System.out.println("--- Saving Account ---");
        saving.displaySavingAccount();

        System.out.println("\n--- Current Account ---");
        current.displayCurrentAccount();

        System.out.println("\n--- Premium Saving Account ---");
        premium.displayPremiumSavingAccount();
    }
}