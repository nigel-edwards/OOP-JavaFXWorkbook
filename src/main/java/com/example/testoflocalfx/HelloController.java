package com.example.testoflocalfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label welcomeText1;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void onHelloButtonClick1() {
        welcomeText1.setText("Welcome to JavaFX Application AGAIN!");
    }
}