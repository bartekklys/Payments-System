package Entities;

public class SalaryEmployee extends Employee implements Payee{
    public SalaryEmployee(String name, Integer bankAccount, Double grossWage) {
        super(name, bankAccount, grossWage);
    }
    public Double grossPayment() {
        return grossWage;
    }
}