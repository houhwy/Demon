package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDmon01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "123456");

        String sql = "update student set age = 15 where id=1";

        Statement statement = connection.createStatement();

        int count = statement.executeUpdate(sql);

        System.out.println(count);

        statement.close();
        connection.close();
    }
}
