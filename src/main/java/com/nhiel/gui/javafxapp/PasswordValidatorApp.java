package com.nhiel.gui.javafxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PasswordValidatorApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("password_validator.fxml"));
        Scene scene = new Scene(loader.load(), 300, 200);

        stage.setTitle("Password Validation");
        stage.setScene(scene);
        stage.show();
    }
}