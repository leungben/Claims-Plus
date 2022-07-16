package test.project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class SignUpController {

    Connection conn;

    @FXML
    private Label prompt;

    @FXML
    private TextField emailAddress;

    @FXML
    private TextField employeeID;

    @FXML
    private TextField name;

    @FXML
    private PasswordField password;

    @FXML
    private Button singnUp;

    @FXML
    void signUp(ActionEvent event) throws SQLException, IOException {
        LoginModel testData = new LoginModel();
        conn = dbConnection.getConnection();
        if (testData.isEmail(emailAddress.getText()) || testData.isPassword(password.getText())) {
            prompt.setText("Password or Email already In Use!");
            prompt.textFillProperty().set(Color.RED);
        } else {
            PreparedStatement insertEmployee = testData.connect.prepareStatement(
                    "INSERT INTO employee(emailAddress, password, name, employeeID) VALUES (?, ?, ?,?)");
            insertEmployee.setString(1, emailAddress.getText());
            insertEmployee.setString(2, password.getText());
            insertEmployee.setString(3, name.getText());
            insertEmployee.setString(4, employeeID.getText());
            insertEmployee.executeUpdate();
            App.setRoot("home");

        }
    }

}
