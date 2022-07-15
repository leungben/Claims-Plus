package test.project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AccountController implements Initializable {
    @FXML
    private TableColumn<Customer, Integer> accountID;

    @FXML
    private TextField ans1;

    @FXML
    private TextField ans2;

    @FXML
    private TextField ans3;

    @FXML
    private TextField ans4;

    @FXML
    private TextField ans5;

    @FXML
    private TableView<Customer> accountTable;

    @FXML
    private Button back;

    @FXML
    private TableColumn<Customer, Integer> claimID;

    @FXML
    private TableColumn<Customer, String> emailAdress;

    @FXML
    private TableColumn<Customer, String> name;

    @FXML
    private Button submitButt;

    @FXML
    private TableColumn<Customer, Integer> telephoneNum;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        accountID.setCellValueFactory(new PropertyValueFactory<Customer, Integer>("accountID"));
        name.setCellValueFactory(new PropertyValueFactory<Customer, String>("name"));
        claimID.setCellValueFactory(new PropertyValueFactory<Customer, Integer>("claimID"));
        telephoneNum.setCellValueFactory(new PropertyValueFactory<Customer, Integer>("telephoneNum"));
        emailAdress.setCellValueFactory(new PropertyValueFactory<Customer, String>("emailAdress"));

    }

    @FXML
    void goBack(ActionEvent event) throws IOException {
        App.setRoot("home");
    }

    @FXML
    void submitAccount(ActionEvent event) {
        Customer customer = new Customer(Integer.parseInt(ans1.getText()),
                ans2.getText(), Integer.parseInt(ans3.getText()), Integer.parseInt(ans4.getText()), ans5.getText());

        ObservableList<Customer> customers = accountTable.getItems();
        customers.add(customer);
        accountTable.setItems(customers);
    }
}
