package Entities;

public class Employee {

    private String name;
    private Integer bankAccount;
    protected Double grossWage;

    public Employee(String name, Integer bankAccount, Double grossWage) {
        this.name = name;
        this.bankAccount = bankAccount;
        this.grossWage = grossWage;
    }
    public String name() {
        return name;
    }
    public Integer bankAccount() {
        return bankAccount;
    }
}
