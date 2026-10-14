package com.example.testoflocalfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class HelloModsApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        /*
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        Label greeting = new Label("Welcome to JavaFX");
        greeting.setTextFill(Color.GREEN);
        greeting.setFont(Font.font("Time New Roman", FontWeight.BOLD, 70));
        root.getChildren().add(greeting);
        stage.setTitle("Hello out there!");
        stage.setScene(new Scene(root, 800, 300));
        stage.show();

         */

        // As above but using a fxml file
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view-mods.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 300);
        stage.setTitle("Hello out there!");
        stage.setScene(scene);
        stage.show();

    }
}
