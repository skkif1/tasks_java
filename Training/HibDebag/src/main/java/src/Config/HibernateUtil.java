package src.Config;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import src.Entytu.ContractEmployee;
import src.Entytu.Taskmaster;
import src.Entytu.Emplyee;

import java.util.Properties;

public class HibernateUtil {

    private static  SessionFactory factory;

    static {
        try {

            Properties properties = new Properties();
            properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hib_debug");
            properties.setProperty("hibernate.connection.username", "root");
            properties.setProperty("hibernate.connection.password", "75g03f24");
            properties.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");


            factory = new Configuration()
                    .addPackage("src")
                    .addProperties(properties)
                    .addAnnotatedClass(Emplyee.class)
                    .addAnnotatedClass(Taskmaster.class)
                    .addAnnotatedClass(ContractEmployee.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }

    }

    public static SessionFactory getSessionFactory()
    {
        return factory;
    }

    public static void shutdown()
    {
        factory.close();
    }

}
