package Dao;


import Entyti.Deposite;
import Entyti.MoneyAcount;

import java.util.List;

public interface DepositeDao {

    public List<Deposite> SearcDeposite(MoneyAcount acount);
}
