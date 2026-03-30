package com.nhiel.gui.javafxapp;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class CharacterRemoverController {

    @FXML private Label textLabel;
    @FXML private CheckBox vowelCheckbox;
    @FXML private CheckBox consonantCheckbox;
    @FXML private CheckBox numberCheckbox;

    private final String originalText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    @FXML
    public void initialize() {
        // Set component "names"
        vowelCheckbox.setId("vowelCheckbox");
        consonantCheckbox.setId("consonantCheckbox");
        numberCheckbox.setId("numberCheckbox");

        textLabel.setId("textLabel");

        // Optional (extra safe naming)
        vowelCheckbox.setAccessibleText("vowelCheckbox");
        consonantCheckbox.setAccessibleText("consonantCheckbox");
        numberCheckbox.setAccessibleText("numberCheckbox");
    }

    @FXML
    private void handleRemove() {
        String text = textLabel.getText();

        if (vowelCheckbox.isSelected()) {
            text = text.replaceAll("[AEIOU]", "");
        }

        if (consonantCheckbox.isSelected()) {
            text = text.replaceAll("[BCDFGHJKLMNPQRSTVWXYZ]", "");
        }

        if (numberCheckbox.isSelected()) {
            text = text.replaceAll("[0-9]", "");
        }

        textLabel.setText(text);
    }

    @FXML
    private void handleRestore() {
        textLabel.setText(originalText);
    }
}