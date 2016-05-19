import Entities.Payee;
import Entities.TaxablePayee;

import java.util.ArrayList;
import java.util.List;

public class PaymentSystem {

    private List<Payee> payees;
    Double taxRate = 0.2;

    public PaymentSystem() {
        payees = new ArrayList<Payee>();
    }
    public void addPayee(Payee payee) {
        if (!payees.contains(payee)) {
            payees.add(payee);
        }
    }
    public void processPayments() {
        for (Payee payee : payees) {
            Double grossPayment = payee.grossPayment();
            Double tax = 0.0;
            if (payee instanceof TaxablePayee) {
                Double taxableIncome = grossPayment - ((TaxablePayee)payee).allowance();
                tax = taxableIncome * taxRate;
            }
            Double netPayment = grossPayment - tax;
            System.out.println("Paying to " + payee.name());
            System.out.println("tGrosst " + grossPayment);
            System.out.println("tTaxtt -" + tax);
            System.out.println("tNettt " + netPayment);
            System.out.println("tTransferred to Account: " + payee.bankAccount());
        }
    }
}
