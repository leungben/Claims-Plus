package test.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {
    Connection connect;

    public LoginModel() {
        connect = dbConnection.getConnection();
        if (connect == null)
            System.exit(1);
    }

    public boolean isDbconn() {
        try {
            return !connect.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isLogin(String email, String password) throws SQLException {
        PreparedStatement employeeTable = null;
        ResultSet resultSet = null;
        String loginSelection = "select * from employee where emailAddress = ? and password = ?";
        try {
            employeeTable = connect.prepareStatement(loginSelection);
            employeeTable.setString(1, email);
            employeeTable.setString(2, password);
            resultSet = employeeTable.executeQuery();
            if (resultSet.next()) {
                return true;
            } else {
                return false;

            }
        } catch (Exception e) {
            return false;
        } finally {
            employeeTable.close();
            resultSet.close();
        }
    }
}
