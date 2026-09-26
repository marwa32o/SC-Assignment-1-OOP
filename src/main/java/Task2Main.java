/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.ArrayList;
import java.util.List;

public class Task2Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Developer("Ali", 50000, 10000));

        employees.add(new SalesManager("Sara", 50000, 100000, 0.05));

        for (Employee employee : employees) {

            System.out.println(
                    employee.getName()
                    + " Final Pay: "
                    + employee.calculatePay()
            );
        }
    }
}