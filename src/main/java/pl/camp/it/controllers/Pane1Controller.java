package pl.camp.it.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class Pane1Controller {

    @FXML
    Button button1;

    @FXML
    CheckBox checkBox1;

    @FXML
    Label label1;

    @FXML
    public void click() {
        System.out.println("Kliknięto w przycisk !!");
    }

    @FXML
    public void checkBoxClick() {
        System.out.println("Kliknięto w checkBox");
    }

    @FXML
    public void labelClick() {
        System.out.println("Klikniętow label");
    }
}
