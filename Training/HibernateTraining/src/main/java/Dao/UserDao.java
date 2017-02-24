package Dao;

import Entyti.Deposite;
import Entyti.User;

import java.util.List;

public interface UserDao {

    public void addUser(User user);

    public User searchUser();

    public void deleteUser();

}
