public class BankDemo {
    public static void main(String[] args) {
        BankAccount BankAccount1 = new BankAccount("12345", "SomeDude", 500);
        BankAccount BankAccount2 = new BankAccount("67890", "OtherDude", 1000);

        BankAccount1.print(); // Print details of BankAccount1.
        
        BankAccount1.close(); // This will throw an exception since the balance is not zero.
        BankAccount1.deposit(200); // This will throw an exception as the BankAccount is already closed.
        BankAccount1.withdraw(100); // This will also throw an exception due to BankAccount closure.
        
        BankAccount1.reOpen(); // This should succeed after closure.
        BankAccount1.transferTo(BankAccount2, 2000); // This will throw an exception due to insufficient funds.

        BankAccount.printAll(new BankAccount[] {BankAccount1, BankAccount2});
        System.out.println("Index of BankAccount Number '12345': " + BankAccount.find(new BankAccount[] {BankAccount1, BankAccount2}, "12345"));
    }
}
