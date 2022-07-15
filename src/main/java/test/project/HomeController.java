package test.project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.Initializable;

public class HomeController implements Initializable {

    @FXML
    private Button back;

    @FXML
    private Button butAcc;

    @FXML
    private Button butClaims;

    @FXML
    private TableColumn<Claim, Integer> col1;

    @FXML
    private TableColumn<Claim, Integer> col11;

    @FXML
    private TableColumn<Claim, String> col2;

    @FXML
    private TableColumn<Claim, String> col21;

    @FXML
    private TableColumn<Claim, String> col3;

    @FXML
    private TableColumn<Claim, String> col31;

    @FXML
    private TableColumn<Claim, String> col4;

    @FXML
    private TableColumn<Claim, String> col41;

    @FXML
    private TableView<Claim> currentClaims;

    @FXML
    private TableView<Claim> currentClaims1;

    @FXML
    private Button sett;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        col1.setCellValueFactory(new PropertyValueFactory<Claim, Integer>("claimID"));
        col2.setCellValueFactory(new PropertyValueFactory<Claim, String>("info"));
        col3.setCellValueFactory(new PropertyValueFactory<Claim, String>("holder"));
        col4.setCellValueFactory(new PropertyValueFactory<Claim, String>("date"));
        col11.setCellValueFactory(new PropertyValueFactory<Claim, Integer>("claimID"));
        col21.setCellValueFactory(new PropertyValueFactory<Claim, String>("info"));
        col31.setCellValueFactory(new PropertyValueFactory<Claim, String>("holder"));
        col41.setCellValueFactory(new PropertyValueFactory<Claim, String>("date"));
    }

    @FXML
    void accountScreen(ActionEvent event) throws IOException {
        App.setRoot("accountHolder");
    }

    @FXML
    void claimsScreen(ActionEvent event) throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    void settingsApp(ActionEvent event) throws IOException {
        App.setRoot("employeeProfile");
    }
};
