package src.Dao.DaoImpl;


import org.hibernate.Session;
import org.hibernate.query.Query;
import src.Config.HibernateUtil;
import src.Dao.UserDao;
import src.Entytu.Emplyee;

public class UserDaoImpl implements UserDao{


    Session session;

    public UserDaoImpl() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public void save(Emplyee emplyee) {

        session.beginTransaction();
        session.save(emplyee);
        session.getTransaction().commit();
    }

    @Override
    public void deleteByName(String name) {
        session.beginTransaction();
        Query query = session.createQuery("delete from User where name =: name");
        query.setParameter("name", name);
        query.executeUpdate();
        session.getTransaction().commit();

    }


    @Override
    public Emplyee fetch(Integer id) {
        Emplyee emplyee;
        session.beginTransaction();
        emplyee = session.get(Emplyee.class, id);
        session.getTransaction().commit();
        return emplyee;
    }

    @Override
    public Emplyee fetchByName(String name, String lastName) {
        Emplyee emplyee;
        session.beginTransaction();
        emplyee = (Emplyee)session.createQuery("from user user where user.name = ? and  user.last_name = ?")
                .setParameter(0, name)
                .setParameter(1, lastName)
                .getSingleResult();
        session.getTransaction().commit();
        return emplyee;
    }


}
