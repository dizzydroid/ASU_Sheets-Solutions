public class CheckedBankDemo {
    public static void main(String[] args) {
        CheckedBankAccount account1 = new CheckedBankAccount("12345", "SomeDude", 500);

        try {
            account1.print();
            account1.close(); // This will throw an exception
        } catch (BankAccountException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            account1.deposit(200); // This should succeed
        } catch (BankAccountException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            account1.withdraw(100); // This should succeed
        } catch (BankAccountException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            account1.reOpen(); // Will throw an exception since account is not closed
        } catch (BankAccountException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Demonstrating transfer with exception handling
        CheckedBankAccount account2 = new CheckedBankAccount("67890", "OtherDude", 1000);
        try {
            account1.transferTo(account2, 2000); // Will throw an exception due to insufficient funds
        } catch (BankAccountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
