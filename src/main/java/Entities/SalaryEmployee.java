package Entities;

public class SalaryEmployee extends Employee {
    public SalaryEmployee(String name, Integer bankAccount, Double grossWage) {
        super(name, bankAccount, grossWage);
    }
    public void giveBonus(Double percentage) {
        currentBonus += grossWage * (percentage/100.0);
    }
    public Double grossPayment() {
        return grossWage + doCurrentBonus();
    }
}