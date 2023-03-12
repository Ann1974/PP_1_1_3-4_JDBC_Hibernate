package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {//  создание и объединение
    // соединений с базой данных. Может скрыть от клиента
    // реализацию подключения к базе данных,
    // реализуйте настройку соединения с БД
    private  static final String URL = "jdbc:mysql://localhost:3306/pp_1_1_3-4_jdbc_hibernate";
    private  static final String LOGIN = "root";
    private  static final String PASSWORD = "root";
    private  static Connection connection ;
    public static Connection connectionIdbc() {  //  соединение с базой данных
        try {
            if (connection == null || connection.isClosed()){
                connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            }
        } catch (SQLException e) {
            System.out.println("Не удалось подключиться к БД");
            e.printStackTrace();
        }

        return connection;
    }

}
