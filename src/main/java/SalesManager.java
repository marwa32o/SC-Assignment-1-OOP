public class SalesManager extends Employee {
    private double totalSales;
    private double commissionRate;

    public SalesManager(String name, double baseSalary, double totalSales, double commissionRate) {
        super(name, baseSalary);
        this.totalSales = totalSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (totalSales * commissionRate);
    }
}