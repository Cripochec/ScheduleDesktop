module com.example.scheduledesktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.postgresql.jdbc;
    requires org.json;
    requires java.net.http;


    opens com.example.scheduledesktop to javafx.fxml;
    exports com.example.scheduledesktop;
}