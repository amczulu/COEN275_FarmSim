module com.example.farmgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.farmgui to javafx.fxml;
    exports com.example.farmgui;
}