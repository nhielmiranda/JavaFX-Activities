package com.nhiel.gui.javafxapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class PasswordValidatorController {

    @FXML private PasswordField passwordTextField;
    @FXML private Label statusLabel;

    @FXML
    public void initialize() {

        passwordTextField.setId("passwordTextField");
        statusLabel.setId("statusLabel");

        passwordTextField.textProperty().addListener((obs, oldVal, newVal) -> validate(newVal));
    }

    private void validate(String password) {

        if (password.length() < 8) {
            statusLabel.setText("Password must be 8 characters long");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        if (!password.matches(".*\\d.*")) {
            statusLabel.setText("Password must contain at least one digit");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        if (!password.matches(".*[^a-zA-Z0-9].*")) {
            statusLabel.setText("Password must contain at least one special character");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        statusLabel.setText("Password is valid");
        statusLabel.setStyle("-fx-text-fill: green;");
    }
}