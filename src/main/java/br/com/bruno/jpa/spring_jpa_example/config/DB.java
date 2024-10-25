package br.com.bruno.jpa.spring_jpa_example.config;

import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class DB {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection != null) {
            return connection;
        }
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_innovation_one", "root", "root");
    }
}
