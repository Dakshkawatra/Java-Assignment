class Account {

    private String accountNumber;
    private String ownerName;
    private double balance;

    Account(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        balance = 0;
    }

    Account(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (balance >= 0) {
            this.balance = balance;
        }
        else {
            this.balance = 0;
        }
    }

    boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        }

        return false;
    }

    boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        }

        return false;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    String getOwnerName() {
        return ownerName;
    }

    double getBalance() {
        return balance;
    }
    public String toString() {
        return "Account{accountNumber=" + accountNumber
                + ", ownerName=" + ownerName
                + ", balance=" + balance + "}";
    }
}
