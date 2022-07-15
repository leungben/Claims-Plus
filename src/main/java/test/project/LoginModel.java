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
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String loginSelection = "select * from employee where emailAddress = ? and password = ?";
        try {
            preparedStatement = connect.prepareStatement(loginSelection);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            } else {
                return false;

            }
        } catch (Exception e) {
            return false;
        } finally {
            preparedStatement.close();
            resultSet.close();
        }
    }
}
