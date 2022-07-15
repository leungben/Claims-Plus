package test.project;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {
    public LoginModel loginModel = new LoginModel();

    @FXML
    private Label connectionTest;

    @FXML
    private TextField email;

    @FXML
    private TextField password;

    @FXML
    private Button primaryButton;

    @FXML
    private Button signUp;

    @FXML
    void signupButton(ActionEvent event) throws IOException {
        App.setRoot("signUp");
    }

    @FXML
    private void Login() throws IOException, SQLException {
        String auth1 = email.getText();
        String auth2 = password.getText();
        if (loginModel.isLogin(auth1, auth2)) {
            App.setRoot("home");
        } else {
            connectionTest.setStyle("-fx-text-fill: red;");
            connectionTest.setText("Wrong Email or Password!");
        }
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        if (loginModel.isDbconn()) {
            connectionTest.setStyle("-fx-text-fill: green;");
            connectionTest.setText("Connection made!");
        } else {
            connectionTest.setText("Not connected!");
        }
    }

}
