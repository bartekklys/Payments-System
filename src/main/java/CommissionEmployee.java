
public class CommissionEmployee implements Payee {
    private String name;
    private Integer bankAccount;
    protected Double grossWage;
    private Double grossCommission = 0.0;

    public CommissionEmployee(String name, Integer bankAccount, Double grossWage) {
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
        return grossWage + doCurrentCommission();
    }

    private Double doCurrentCommission() {
        Double commission = grossCommission;
        grossCommission = 0.0;
        return commission;
    }
}
