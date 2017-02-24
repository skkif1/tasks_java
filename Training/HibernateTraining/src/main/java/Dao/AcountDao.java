package Dao;


import Entyti.Deposite;
import Entyti.MoneyAcount;

import java.util.List;

public interface AcountDao {

    public void addAcount(String phone, String name, List<Deposite> deposites);
}
