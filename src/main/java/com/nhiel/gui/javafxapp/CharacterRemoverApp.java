package com.nhiel.gui.javafxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CharacterRemoverApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("character_remover.fxml")
        );

        Scene scene = new Scene(loader.load(), 400, 300);

        stage.setTitle("Character Remover");
        stage.setScene(scene);
        stage.show();
    }
}