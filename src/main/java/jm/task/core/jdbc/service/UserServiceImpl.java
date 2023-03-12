package jm.task.core.jdbc.service;


import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import java.util.List;


public class UserServiceImpl implements UserService { // бизнес - логика
    // связанная с сущностью "пользователь"
   UserDaoJDBCImpl userDaoJDBCImpl  = new UserDaoJDBCImpl();
    // класс использует объекты userDaoJDBCImpl для вызова методов


    public void createUsersTable() {
        userDaoJDBCImpl.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoJDBCImpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoJDBCImpl.saveUser(name, lastName, age);
        System.out.println("User с именем – " + name + " добавлен в базу данных");
    }

    public void removeUserById(long id) {
        userDaoJDBCImpl.removeUserById(id);
    }

    public List<User> getAllUsers() {
        userDaoJDBCImpl.getAllUsers();
        List <User> listUsers = userDaoJDBCImpl.getAllUsers();
       if (listUsers != null && !listUsers.isEmpty()){
           listUsers.forEach(System.out::print);

       }
       return listUsers;
    }

    public void cleanUsersTable() {
        userDaoJDBCImpl.cleanUsersTable();
    }
}
