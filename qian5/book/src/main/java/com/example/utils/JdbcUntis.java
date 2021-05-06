package com.example.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUntis {
    private static DruidDataSource dataSource;

//    static {
//
//        try {
//            Properties properties =new Properties() ;
//            InputStream inputStream = JdbcUntis.class.getClassLoader().getResourceAsStream("druid.properties");
//            properties.load(inputStream);
//            dataSource= (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    static {
        try {
            //1.加载配置文件
            Properties pro = new Properties();
            pro.load(JdbcUntis.class.getClassLoader().getResourceAsStream("druid.properties"));
            //2.获DataSource
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(pro);
    } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //连接池中获取链接
    //返回null表示获取连接失败
    public static Connection getConnection(){
        Connection connection=null;
        try {
            connection=dataSource.getConnection();
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }
    //关闭连接
    public static void close(Connection con){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
