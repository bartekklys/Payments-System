package Entities;

import javax.persistence.Entity;

@Entity
public class SalaryEmployee extends Employee {
    public SalaryEmployee(){}
    public SalaryEmployee(String name, Integer bankAccount, Double grossWage, Double allowance) {
        super(name, bankAccount, grossWage, allowance);
    }
    public void giveBonus(Double percentage) {
        currentBonus += grossWage * (percentage/100.0);
    }
    public Double grossPayment() {
        return grossWage + doCurrentBonus();
    }
}