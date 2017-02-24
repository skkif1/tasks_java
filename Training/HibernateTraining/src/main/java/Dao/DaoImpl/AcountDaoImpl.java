package Dao.DaoImpl;


import Dao.AcountDao;
import Entyti.Deposite;
import Entyti.MoneyAcount;
import HibernateUtil.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class AcountDaoImpl implements AcountDao{

    public void addAcount(String phone, String name, List<Deposite> deposites) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        MoneyAcount acount = new MoneyAcount();
        acount.setDeposite("name");
        acount.setDeposits(deposites);
        session.save(acount );
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
