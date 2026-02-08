package service;

import models.User;

public class BudgetService {

    public void addIncome(User user, double amount, String des) {
        if (amount <= 0 || des.isBlank()) throw new IllegalArgumentException("amount invalid");
        user.increaseBalance(amount);
        System.out.println("You added $" + amount + "(Source: " + des + ")");
    }

    public void addExpense(User user, double amount, String des) {
        if (amount <= 0 || amount > user.getBalance() || des.isBlank()) throw new IllegalArgumentException("amount invalid");
        user.decreaseBalance(amount);
        System.out.println("You spent $" + amount);
    }

    public double showBalance(User user) {
        return user.getBalance();
    }
}
