package cn.itcast.jdbc;

import cn.uitil.JDBCUtils;

import java.sql.*;
import java.util.Collection;

public class JdbcDemon06 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            connection= DriverManager.getConnection("jdbc:mysql:///db1","root","123456");
            JDBCUtils.getConnection();
            String sql = "Select * from student";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int a = resultSet.getInt("id");
                String b = resultSet.getString("name");

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet, statement, connection);
        }
    }
}
