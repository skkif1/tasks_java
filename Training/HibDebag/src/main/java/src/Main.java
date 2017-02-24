package src;

import org.hibernate.Session;
import src.Config.HibernateUtil;
import src.Entytu.ContractEmployee;
import src.Entytu.Taskmaster;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;


public class Main {

    public static void main(String[] args) throws Exception {

       try {
           ContractEmployee contractEmployee = new ContractEmployee();
           contractEmployee.setTest("test788/9+");
           ContractEmployee contractEmployee1 = new ContractEmployee();
           contractEmployee.setTest("tesasft788/9+");
           ContractEmployee contractEmployee2 = new ContractEmployee();
           contractEmployee.setTest("teasdst788/9+");
           Set<ContractEmployee> emp = new HashSet<>();
           emp.add(contractEmployee);
           emp.add(contractEmployee1);
           emp.add(contractEmployee2);

           Taskmaster taskmaster = new Taskmaster();
           taskmaster.setDepartment("Loading");
           taskmaster.setName("loll");
           taskmaster.setLastName("two");


           Session session = HibernateUtil.getSessionFactory().openSession();
           session.beginTransaction();
           session.save(contractEmployee);
           session.getTransaction().commit();

           HibernateUtil.shutdown();
       }catch (Throwable ex)
       {
           throw new Exception(ex);
       }finally
       {

       }
    }
}
