package com.example.test;

import com.example.utils.JdbcUntis;
import org.junit.Test;

import java.sql.Connection;

public class JdbcUitilTest {
    @Test
    public void uitil(){
        for (int i=0;i<100;i++){
            Connection connection=JdbcUntis.getConnection();
        System.out.println(connection);
        JdbcUntis.close(connection);
        }
    }
}
