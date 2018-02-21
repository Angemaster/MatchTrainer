package com.matchtrainer.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class Conexion {
    private Connection connection;
    private Connection getConnection() {
        if(connection == null) {
            try {
                InitialContext ctx = new InitialContext();
                DataSource dataSource =
                        (DataSource) ctx.lookup("jdbc/MySQLDataSource");
                connection = dataSource.getConnection();
            } catch (NamingException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
