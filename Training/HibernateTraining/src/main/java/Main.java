import Dao.DaoImpl.AcountDaoImpl;
import Dao.DaoImpl.DepositeDaoImpl;
import Dao.DaoImpl.UserDaoImpl;
import Entyti.Deposite;
import Entyti.MoneyAcount;
import Entyti.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)throws Exception {

        Deposite deposite = new Deposite();
        deposite.setSum(new BigDecimal(100));
        List<Deposite> depositeList = new ArrayList<Deposite>();
        depositeList.add(deposite);

        MoneyAcount acount = new MoneyAcount();

        acount.setDeposits(depositeList);

        User user = new User("First", "lolo", "asdsdassda@mail.com", "1233333",acount);
        UserDaoImpl dao = new UserDaoImpl();
        dao.addUser(user);

       // dao.add(user, LocalDate.of(2016,11,11), LocalDate.of(2016,11,12), 10, new BigDecimal(1000));





    }
}
