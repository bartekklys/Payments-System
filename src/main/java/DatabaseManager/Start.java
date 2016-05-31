package DatabaseManager;

import Entities.CommissionEmployee;
import Entities.SalaryEmployee;
import Entities.ContractingCompany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jfairy.Fairy;
import org.jfairy.producer.person.Person;

public class Start {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Fairy fairy = Fairy.create();
        Person salaryPerson = fairy.person();

        session.getTransaction().commit();
        sessionFactory.close();
    }
}
