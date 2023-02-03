package com.khady.dao.inter;

import com.khady.entity.User;

import java.sql.ResultSet;
import java.util.List;

public interface UserDaoInter {
    public List<User> getAll(String name,String surname,String email,String password);
    public User getById(int userId);
    public User getByEmailAndPassword(String email,String password);
    public User findByName(String name);
    public boolean removeUser(int userId);
    public boolean updateUser(User u);
    public boolean updatePassword(int userId,String password);
    public boolean addUser(User u);

}
