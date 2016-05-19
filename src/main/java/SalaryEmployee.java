

public class SalaryEmployee extends Employee {
    public SalaryEmployee(String name, Integer bankAccount, Double grossWage) {
        super(name, bankAccount, grossWage);
    }
    public Double grossPayment() {
        return grossWage;
    }
}