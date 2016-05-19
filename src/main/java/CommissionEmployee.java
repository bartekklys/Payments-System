
public class CommissionEmployee extends Employee {
    private Double grossCommission = 0.0;
    public CommissionEmployee(String name, Integer bankAccount, Double grossWage) {
        super(name, bankAccount, grossWage);
    }
    public Double grossPayment() {
        return grossWage + doCurrentCommission();
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
