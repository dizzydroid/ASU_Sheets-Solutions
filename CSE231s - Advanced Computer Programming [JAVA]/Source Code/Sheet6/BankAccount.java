public class BankAccount {
    private String accountNum;
    private String holderName;
    private float balance;
    private boolean isOpen;

    public BankAccount(String accountNum, String holderName, float balance) {
        this.accountNum = accountNum;
        this.holderName = holderName;
        this.balance = balance;
        this.isOpen = true; // Account is open by default
    }

    public void print() {
        System.out.println("Account Number: " + accountNum);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Account Status: " + (isOpen ? "Open" : "Closed"));
    }

    public float getBalance() {
        return balance;
    }

    public void close() {
        if (!isOpen) {
            throw new BankAccountException("Account already closed.");
        }
        if (balance != 0) {
            throw new BankAccountException("Cannot close an account that has money.");
        }
        isOpen = false;
    }

    public void reOpen() {
        if (isOpen) {
            throw new BankAccountException("Account is already open.");
        }
        isOpen = true;
    }

    public void deposit(float amount) {
        if (amount <= 0) {
            throw new BankAccountException("Deposit amount must be positive.");
        }
        if (!isOpen) {
            throw new BankAccountException("Cannot deposit to a closed account.");
        }
        balance += amount;
    }

    public void withdraw(float amount) {
        if (amount <= 0) {
            throw new BankAccountException("Withdrawal amount must be positive.");
        }
        if (!isOpen) {
            throw new BankAccountException("Cannot withdraw from a closed account.");
        }
        if (balance < amount) {
            throw new BankAccountException("Insufficient funds.");
        }
        balance -= amount;
    }

    public void transferTo(BankAccount other, float amount) {
        if (amount <= 0) {
            throw new BankAccountException("Transfer amount must be positive.");
        }
        if (!isOpen || !other.isOpen) {
            throw new BankAccountException("One or both accounts are closed.");
        }
        if (balance < amount) {
            throw new BankAccountException("Insufficient funds for transfer.");
        }
        this.withdraw(amount);
        other.deposit(amount);
    }

    public static void printAll(BankAccount[] accounts) {
        for (BankAccount account : accounts) {
            account.print();
        }
    }

    public static int find(BankAccount[] accounts, String accountNum) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountNum.equals(accountNum)) {
                return i;
            }
        }
        return -1;
    }
}

class BankAccountException extends RuntimeException {
    public BankAccountException(String message) {
        super(message);
    }
}
