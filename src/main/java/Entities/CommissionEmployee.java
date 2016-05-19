package Entities;

import javax.persistence.Entity;

@Entity
public class CommissionEmployee extends Employee {
    private static final Double bonusMultiplier = 1.5;
    private Double grossCommission = 0.0;
    public CommissionEmployee(){}
    public CommissionEmployee(String name, Integer bankAccount, Double grossWage, Double allowance) {
        super(name, bankAccount, grossWage, allowance);
    }
    public void giveBonus(Double percentage) {
        currentBonus += grossWage * (percentage/100.0) * bonusMultiplier;
    }
    public Double grossPayment() {
        return grossWage + doCurrentBonus() + doCurrentCommission();
    }
    private Double doCurrentCommission() {
        Double commission = grossCommission;
        grossCommission = 0.0;
        return commission;
    }
    public void giveCommission(Double amount) {
        grossCommission += amount;
    }
}
