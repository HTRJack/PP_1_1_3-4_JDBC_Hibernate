package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    // реализуйте настройку соеденения с БД
    static final String DB_URL = "jdbc:mysql://localhost:3306";
    static final String DB_USER = "root";
    static final String DB_PASS = "root";
    static Driver driver;

    static Connection connection = null;

    public static Connection getConnection() {
        try {
            driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            return connection;
        } catch (SQLException e) {
            System.err.println("Что-то пошло не так");
        }
        return connection;
    }


}
