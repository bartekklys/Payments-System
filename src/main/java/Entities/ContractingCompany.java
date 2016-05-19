package Entities;

import System.Payee;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContractingCompany implements Payee {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private Integer bankAccount;
    private Double currentBalance;
    public ContractingCompany(String name, Integer bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
        currentBalance = 0.0;
    }
    public String name() {
        return name;
    }
    public Double grossPayment() {
        return doPayment();
    }
    private Double doPayment() {
        Double balance = currentBalance;
        currentBalance = 0.0;
        return balance;
    }
    public Integer bankAccount() {
        return bankAccount;
    }
    public void payForServices(Double amount) {
        currentBalance += amount;
    }
}