module test.project {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires org.slf4j;
    requires java.sql;
    requires com.sothawo.mapjfx;

    opens test.project to javafx.fxml, javafx.graphics;

    exports test.project;
}
