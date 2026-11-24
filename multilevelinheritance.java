class Account {
    int accountNumber;

    void showAccount() {
        System.out.println("Account Number: " + accountNumber);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    void showSavingsDetails() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class FixedDepositAccount extends SavingsAccount {
    int lockInYears;

    void showFDDetails() {
        System.out.println("Lock-in Years: " + lockInYears);
    }
}

class multilevelinheritance {
    public static void main(String[] args) {

        FixedDepositAccount f = new FixedDepositAccount();

        f.accountNumber = 101;
        f.interestRate = 7.5;
        f.lockInYears = 5;

        f.showAccount();
        f.showSavingsDetails();
        f.showFDDetails();
    }
}