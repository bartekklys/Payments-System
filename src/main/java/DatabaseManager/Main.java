package DatabaseManager;

import Entities.CommissionEmployee;
import Entities.SalaryEmployee;
import Entities.ContractingCompany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        CommissionEmployee johnSmith = new CommissionEmployee("John Smith", 1111, 300.0, 100.0);
        CommissionEmployee paulJones = new CommissionEmployee("Paul Jones", 2222, 350.0, 125.0);
        SalaryEmployee maryBrown = new SalaryEmployee("Mary Brown", 3333, 500.0, 110.0);
        SalaryEmployee susanWhite = new SalaryEmployee("Susan White", 4444, 470.0, 130.0);
        ContractingCompany acmeInc = new ContractingCompany("Acme Inc", 5555);
        ContractingCompany javaCodeGeeks = new ContractingCompany("javacodegeeks.com", 6666);

        session.save(johnSmith);
        session.save(paulJones);
        session.save(maryBrown);
        session.save(susanWhite);
        session.save(acmeInc);
        session.save(javaCodeGeeks);

        session.getTransaction().commit();
        sessionFactory.close();
    }
}
