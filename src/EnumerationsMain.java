import java.util.*;

// Defining an Enum
enum AccountStatus {
    ACTIVE,
    SUSPENDED,
    CLOSED;

    //Methods of our Enum
    public static AccountStatus fromString(String statusstr) {
        try{
            //converts string to enum, automatically checking if it's valid
            return AccountStatus.valueOf(statusstr.toUpperCase());
        } catch (IllegalArgumentException e){
            // Throws a custom exception for invalid inputs
            throw new IllegalArgumentException("Invalid status: " + statusstr);
        }
    }
}

// 2. Class demonstrating Wrapper Classes and Input Validation
class UserAccount {
    // Using a wrapper class (Integer) instead of primitive (int).
    // This allows the balance to be 'null' (e.g., if an account doesn't exist yet).
    private Integer balance;
    private AccountStatus status;

    public UserAccount(Integer initialBalance, String statusInput){
        // Validate and set balance (cannot be negative)
        if (initialBalance == null || initialBalance < 0){
            throw new IllegalArgumentException("Balance cannot be null or negative");
        }
        this.balance = initialBalance;

        //Validate and set status
        this.status = AccountStatus.fromString(statusInput);

    }

    public void displayAccount() {
        // Autoboxing/Unboxing happens automatically when doing math with "balance"
        System.out.println("Account Status: " + status);
        System.out.println("Account Balance: $" + balance);
    }

}

public class EnumerationsMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter initial balance (Wrapper Class demonstration):");
        String balanceInput = input.nextLine();

        System.out.println("Enter account status (ACTIVE, SUSPENDED, CLOSED - Enum demonstration):");
        String statusInput = input.nextLine();

        try {
            // Here we use the Integer wrapper class to parse the string input
            Integer parsedBalance = Integer.parseInt(balanceInput);

            // Attempt to create the account (Input Validation will catch errors here)
            UserAccount account = new UserAccount(parsedBalance, statusInput);
            account.displayAccount();

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid whole number for the balance.");
        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }

}
