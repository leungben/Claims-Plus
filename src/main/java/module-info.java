module test.project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens test.project to javafx.fxml;

    exports test.project;
}
