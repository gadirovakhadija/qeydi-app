package com.khady.dao.inter;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class AbstractDao {
    public Connection connect() throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/qeydi";
    String username = "root";
    String password = "admin";
    Connection c = DriverManager.getConnection(url, username, password);
    return c;
}
}
