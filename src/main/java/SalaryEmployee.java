

public class SalaryEmployee implements Payee {
    private String name;
    private Integer bankAccount;
    protected Double grossWage;
    public SalaryEmployee(String name, Integer bankAccount, Double grossWage) {
        this.name = name;
        this.bankAccount = bankAccount;
        this.grossWage = grossWage;
    }
    public Integer bankAccount() {
        return bankAccount;
    }
    public String name() {
        return name;
    }
    public Double grossPayment() {
        return grossWage;
    }
}