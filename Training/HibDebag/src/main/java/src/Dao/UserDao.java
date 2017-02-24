package src.Dao;

import src.Entytu.Emplyee;

public interface UserDao {

    public void save(Emplyee emplyee);
    public void deleteByName(String name);
    public Emplyee fetch(Integer id);
    public Emplyee fetchByName(String name, String LastName);
}
