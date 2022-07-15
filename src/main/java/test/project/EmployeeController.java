package test.project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmployeeController implements Initializable {

    @FXML
    private Button back;

    @FXML
    private TableView<Employee> tableView;

    @FXML
    private TableColumn<Employee, String> emailAddress;

    @FXML
    private TableColumn<Employee, Integer> employeeID;

    @FXML
    private TableColumn<Employee, String> name;

    @FXML
    private TableColumn<Employee, String> position;

    @FXML
    private TextField info1;

    @FXML
    private TextField info2;

    @FXML
    private TextField info3;

    @FXML
    private TextField info4;

    @FXML
    private Button subNew;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        App.setRoot("home");
    }

    @FXML
    void submitNewAccount(ActionEvent event) {
        Employee employee = new Employee(Integer.parseInt(info1.getText()),
                info2.getText(), info3.getText(), info4.getText());

        ObservableList<Employee> employees = tableView.getItems();
        employees.add(employee);
        tableView.setItems(employees);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        employeeID.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("employeeID"));
        name.setCellValueFactory(new PropertyValueFactory<Employee, String>("name"));
        position.setCellValueFactory(new PropertyValueFactory<Employee, String>("position"));
        emailAddress.setCellValueFactory(new PropertyValueFactory<Employee, String>("emailAddress"));
    }

}
