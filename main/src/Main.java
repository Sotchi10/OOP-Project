import models.User;
import service.BudgetService;

public class Main {
    public static void main(String[] args) {

        User user = new User( "Johny", 18, "johnyyespapa@gmail.com", "cocomelon123");

        BudgetService service = new BudgetService();

        service.addIncome(user, 500, "Salary");
        service.addExpense(user, 100, "Food");

        
        
        System.out.println("Your current balance: $" + service.showBalance(user));
        
    }
}
