package com.nhiel.gui.javafxapp;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

public class FoodOrderController {

    @FXML private CheckBox cPizza;
    @FXML private CheckBox cBurger;
    @FXML private CheckBox cFries;
    @FXML private CheckBox cSoftDrinks;
    @FXML private CheckBox cTea;
    @FXML private CheckBox cSundae;

    @FXML private RadioButton rbNone;
    @FXML private RadioButton rb5;
    @FXML private RadioButton rb10;
    @FXML private RadioButton rb15;

    @FXML
    private void handleOrder() {
        double total = computeTotal();

        double discount = 0;

        if (rb5.isSelected()) discount = 0.05;
        else if (rb10.isSelected()) discount = 0.10;
        else if (rb15.isSelected()) discount = 0.15;

        total = total - (total * discount);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Total");
        alert.setHeaderText(null);
        alert.setContentText("The total price is Php " + String.format("%.2f", total));
        alert.showAndWait();
    }

    private double computeTotal() {
        double total = 0;

        if (cPizza.isSelected()) total += 100;
        if (cBurger.isSelected()) total += 80;
        if (cFries.isSelected()) total += 65;
        if (cSoftDrinks.isSelected()) total += 55;
        if (cTea.isSelected()) total += 50;
        if (cSundae.isSelected()) total += 40;

        return total;
    }
}