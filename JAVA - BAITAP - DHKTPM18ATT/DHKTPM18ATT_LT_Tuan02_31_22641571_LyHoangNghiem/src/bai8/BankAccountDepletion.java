package bai8;

public class BankAccountDepletion {
    public static void main(String[] args) {
        double initialBalance = 10000;
        double annualInterestRate = 0.06; // 6% annual interest rate
        double monthlyInterestRate = annualInterestRate / 12.0;
        double monthlyWithdrawal = 500;

        int months = 0;
        while (initialBalance > 0) {
            initialBalance += initialBalance * monthlyInterestRate; // Add interest
            initialBalance -= monthlyWithdrawal; // Subtract monthly withdrawal
            months++;
        }

        int years = months / 12;
        int remainingMonths = months % 12;

        System.out.println("It takes " + years + " years and " + remainingMonths + " months for the account to be depleted.");
    }
}


