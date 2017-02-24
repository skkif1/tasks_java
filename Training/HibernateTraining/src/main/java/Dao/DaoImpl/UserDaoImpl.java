package Dao.DaoImpl;


import Dao.UserDao;
import Entyti.Deposite;
import Entyti.User;
import HibernateUtil.HibernateUtil;
import org.hibernate.Session;

import javax.swing.text.html.parser.Entity;
import java.util.List;


public class UserDaoImpl implements UserDao {



    public  void addUser(User user) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }


    public User searchUser() {
        return null;
    }

    public void deleteUser() {

    }
}
