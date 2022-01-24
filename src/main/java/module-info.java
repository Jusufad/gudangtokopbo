module com.example.gudangtoko {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gudangtoko to javafx.fxml;
    exports com.example.gudangtoko;
}