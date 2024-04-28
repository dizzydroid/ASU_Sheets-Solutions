public class CheckedBankAccount {
    private String accountNum;
    private String holderName;
    private float balance;
    private boolean isOpen;

    public CheckedBankAccount(String accountNum, String holderName, float balance) {
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

    public void close() throws BankAccountException {
        if (!isOpen) {
            throw new BankAccountException("Account already closed.");
        }
        if (balance != 0) {
            throw new BankAccountException("Cannot close account with non-zero balance.");
        }
        isOpen = false;
    }

    public void reOpen() throws BankAccountException {
        if (isOpen) {
            throw new BankAccountException("Account is already open.");
        }
        isOpen = true;
    }

    public void deposit(float amount) throws BankAccountException {
        if (amount <= 0) {
            throw new BankAccountException("Deposit amount must be positive.");
        }
        if (!isOpen) {
            throw new BankAccountException("Cannot deposit to a closed account.");
        }
        balance += amount;
    }

    public void withdraw(float amount) throws BankAccountException {
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

    public void transferTo(CheckedBankAccount other, float amount) throws BankAccountException {
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

    public static void printAll(CheckedBankAccount[] accounts) {
        for (CheckedBankAccount account : accounts) {
            account.print();
        }
    }

    public static int find(CheckedBankAccount[] accounts, String accountNum) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountNum.equals(accountNum)) {
                return i;
            }
        }
        return -1;
    }
}
