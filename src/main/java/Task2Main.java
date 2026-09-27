import java.util.ArrayList;
import java.util.List;

public class Task2Main {
    public static void main(String[] args) {
        // Create an Employee list storing both Developer and SalesManager objects
        List<Employee> employees = new ArrayList<>();

        // Adding objects to the polymorphism list
        employees.add(new Developer("Alice", 80000, 5000));
        employees.add(new SalesManager("Bob", 60000, 100000, 0.10)); // 10% commission on 100,000 sales

        // Iterate through the generic Employee list
        for (Employee emp : employees) {
            System.out.println("Employee: " + emp.getName() + " | Final Pay: $" + emp.calculatePay());
        }
    }
}