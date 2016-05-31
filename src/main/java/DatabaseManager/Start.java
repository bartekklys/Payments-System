package DatabaseManager;

import Entities.CommissionEmployee;
import Entities.SalaryEmployee;
import Entities.ContractingCompany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jfairy.Fairy;
import org.jfairy.producer.company.Company;
import org.jfairy.producer.person.Person;

public class Start {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Fairy fairy = Fairy.create();

        for(int i = 0 ; i < 20 ; i++) {
            Person salaryPerson = fairy.person();
            Person commissionPerson = fairy.person();
            Company company = fairy.company();

            Integer salaryBankAccount = Integer.valueOf(fairy.baseProducer().numerify("######"));
            Integer commissionBankAccount = Integer.valueOf(fairy.baseProducer().numerify("######"));
            Integer contractingBankAccount = Integer.valueOf(fairy.baseProducer().numerify("######"));

            Double salaryGrossWage = Double.valueOf(fairy.baseProducer().numerify("####.##"));
            Double commissionGrossWage = Double.valueOf(fairy.baseProducer().numerify("####.##"));

            Double salaryAllowance = Double.valueOf(fairy.baseProducer().numerify("####.##"));
            Double commissionAllowance = Double.valueOf(fairy.baseProducer().numerify("####.##"));

            SalaryEmployee salaryEmployee = new SalaryEmployee(salaryPerson.firstName(), salaryBankAccount, salaryGrossWage, salaryAllowance);

            CommissionEmployee commissionEmployee = new CommissionEmployee(commissionPerson.firstName(), commissionBankAccount, commissionGrossWage, commissionAllowance);

            ContractingCompany contractingCompany = new ContractingCompany(company.name(), contractingBankAccount);

            session.save(salaryEmployee);
            session.save(commissionEmployee);
            session.save(contractingCompany);
        }
        session.getTransaction().commit();
        sessionFactory.close();
    }
}
