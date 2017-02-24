package Dao.DaoImpl;


import Entyti.Deposite;
import Entyti.User;
import HibernateUtil.HibernateUtil;
import org.hibernate.Session;
import java.math.BigDecimal;
import java.time.LocalDate;

public class DepositeDaoImpl {

    public void add(User user, LocalDate startDate, LocalDate expirationDate, Integer proccent, BigDecimal sum)
    {
        Deposite deposite = new Deposite();
        deposite.setStartDate(startDate);
        deposite.setExpirationDate(expirationDate);
      //  deposite.setProccent(proccent);

        deposite.setSum(sum);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(deposite);
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();

    }

}
