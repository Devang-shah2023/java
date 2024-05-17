import java.util.Scanner;
public class BankAccount {

     public String accountNo;
     public String userName;
     public String email;
     public String accountType;
     double accountBalance;

    public BankAccount(String accountNo, String userName, String email, String accountType, double accountBalance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public static BankAccount createAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNo = scanner.nextLine();

        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter email address: ");
        String email = scanner.nextLine();

        System.out.print("Enter account type: ");
        String accountType = scanner.nextLine();

        System.out.print("Enter account balance: ");
        double accountBalance = scanner.nextDouble();

        return new BankAccount(accountNo, userName, email, accountType, accountBalance);
    }

    public void displayAccountDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accountNo);
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the bank account management system.");

        BankAccount account = createAccount();
        account.displayAccountDetails();

        System.out.println("\nThank you for using our system!");
    }
}




