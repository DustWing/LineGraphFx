package com.example.linegraphfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    @FXML
    protected void onGraphButtonClick() {
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("graph-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Graph!");
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            throw new RuntimeException("Could not load graph", ex);
        }

    }
}