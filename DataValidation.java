class BankAccount {
    private String accountHolder;
    private double balance;

    public void setAccountHolder(String name) {
        accountHolder = name;
    }
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class DataValidation {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.setAccountHolder("Rahul");
        b.setBalance(5000);

        System.out.println("Account Holder: " + b.getAccountHolder());
        System.out.println("Initial Balance: " + b.getBalance());

        b.setBalance(-1000);
        System.out.println("Balance: " + b.getBalance());
        b.deposit(2000);
        System.out.println("Balance after deposit: " + b.getBalance());
        b.withdraw(10000);
        System.out.println("Final Balance: " + b.getBalance());
    }
}