package test.project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ClaimsController implements Initializable {
    @FXML
    private Button addClaim;

    @FXML
    private TextField ans1;

    @FXML
    private TextField ans2;

    @FXML
    private TextField ans3;

    @FXML
    private TextField ans4;

    @FXML
    private TableColumn<Claim, Integer> claimID;

    @FXML
    private TableColumn<Claim, String> date;

    @FXML
    private TableColumn<Claim, String> holder;

    @FXML
    private TableColumn<Claim, String> info;

    @FXML
    private Button secondaryButton;

    @FXML
    private TableView<Claim> tableView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        claimID.setCellValueFactory(new PropertyValueFactory<Claim, Integer>("claimID"));
        info.setCellValueFactory(new PropertyValueFactory<Claim, String>("info"));
        holder.setCellValueFactory(new PropertyValueFactory<Claim, String>("holder"));
        date.setCellValueFactory(new PropertyValueFactory<Claim, String>("date"));
    }

    @FXML
    void submitClaim(ActionEvent event) {
        Claim claim = new Claim(Integer.parseInt(ans1.getText()),
                ans4.getText(), ans3.getText(), ans2.getText());

        ObservableList<Claim> claims = tableView.getItems();
        claims.add(claim);
        tableView.setItems(claims);

    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("home");
    }
}
