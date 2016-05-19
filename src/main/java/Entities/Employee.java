package Entities;

public abstract class Employee implements Payee{

    private String name;
    private Integer bankAccount;

    protected Double currentBonus;
    protected Double grossWage;

    public Employee(String name, Integer bankAccount, Double grossWage) {
        this.name = name;
        this.bankAccount = bankAccount;
        this.grossWage = grossWage;
        currentBonus = 0.0;
    }
    public String name() {
        return name;
    }
    public Integer bankAccount() {
        return bankAccount;
    }
    public abstract void giveBonus(Double percentage);
    protected Double doCurrentBonus() {
        Double bonus = currentBonus;
        currentBonus = 0.0;
        return bonus;
    }
}
