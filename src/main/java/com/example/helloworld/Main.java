package com.example.helloworld;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello World!");
        Button quitButton = new Button("Quit");

        quitButton.setOnAction(e -> Platform.exit());

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(label, quitButton);
        vbox.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(vbox, 200, 150);

        primaryStage.setTitle("Hello World Dialog");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
