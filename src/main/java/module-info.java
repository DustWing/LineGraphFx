module com.example.linegraphfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.linegraphfx to javafx.fxml;
    exports com.example.linegraphfx;
}