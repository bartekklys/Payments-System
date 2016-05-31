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

        for(int i = 0 ; i < 10 ; i++) {
            Person salaryPerson = fairy.person();
            Integer bankAccount = Integer.valueOf(fairy.baseProducer().numerify("## #### #### #### #### #### ####"));
            Double grossWage = Double.valueOf(fairy.baseProducer().numerify("###"));
            Double allowance = Double.valueOf(fairy.baseProducer().numerify("###"));
            SalaryEmployee salaryEmployee = new SalaryEmployee(salaryPerson.firstName(), bankAccount, grossWage, allowance);

            session.save(salaryEmployee);
        }
        session.getTransaction().commit();
        sessionFactory.close();
    }
}
