package test.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    private static final String SQCONN = "jdbc:sqlite:SqliteDb/ClaimsPlus.db";

    public static Connection getConnection() {

        try {
            Connection conn = DriverManager.getConnection(SQCONN);
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
