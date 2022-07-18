package test.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This is the Login Model Class. It handles authentication of Login information
 */

public class LoginModel {
    Connection connect;

    public LoginModel() {
        // Check if Connection is made with database
        connect = dbConnection.getConnection();
        if (connect == null)
            // Otherwise do not open Application
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

    /*
     * The isEmail method checks if email is already in Database
     */

    public boolean isEmail(String email) throws SQLException {
        PreparedStatement employeeTable = null;
        ResultSet resultSet = null;
        String emailSelection = "SELECT * FROM employee where emailAddress = ?";

        try {
            employeeTable = connect.prepareStatement(emailSelection);
            employeeTable.setString(1, email);
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

    /*
     * The isPassword method checks if password is already in Database
     */

    public boolean isPassword(String password) throws SQLException {
        PreparedStatement employeeTable = null;
        ResultSet resultSet = null;
        String passwordSelection = "SELECT * FROM employee where password = ?";

        try {
            employeeTable = connect.prepareStatement(passwordSelection);
            employeeTable.setString(1, password);
            resultSet = employeeTable.executeQuery();

            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

        finally {
            employeeTable.close();
            resultSet.close();
        }

    }
    /*
     * The isLogin method checks if an Employee with this email & password is
     * already within database.
     */

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
