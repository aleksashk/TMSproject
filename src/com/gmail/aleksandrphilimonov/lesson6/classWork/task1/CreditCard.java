package com.gmail.aleksandrphilimonov.lesson6.classWork.task1;

public class CreditCard {
    private String accountNumber;
    private double amount;

    public CreditCard(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void addAmount(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Invalid value. The value should be more than 0.");
        }
        amount += value;
    }

    public void withdrawAmount(double value) {
        if (value > amount) {
            throw new IllegalArgumentException("Invalid value. The value must be less than or equal to the amount.");
        }
        amount -= value;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "accountNumber='" + accountNumber + '\'' +
                ", amount=" + amount +
                '}';
    }
}
