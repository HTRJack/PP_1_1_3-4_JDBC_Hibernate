package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;


public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Биба", "Бобов", (byte) 25);
        userDao.saveUser("Боба", "Бибов", (byte) 17);
        userDao.saveUser("Вин", "Дроссель", (byte) 19);
        userDao.saveUser("Адам", "Арабов", (byte) 61);

        for (User user : userDao.getAllUsers()) {
            System.out.println(user);
        }

        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
