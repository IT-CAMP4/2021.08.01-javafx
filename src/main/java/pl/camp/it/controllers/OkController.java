package pl.camp.it.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import pl.camp.it.Store;

import java.io.IOException;

public class OkController {

    @FXML
    Label helloLabel;

    @FXML
    Label passwordLabel;

    @FXML
    Label ageLabel;

    @FXML
    Button back;

    public void initialize() {
        helloLabel.setText("Witaj " + Store.login);
        passwordLabel.setText("Twoje hasło: " + Store.password);
        ageLabel.setText("Twój wiek: " + Store.age);
    }

    @FXML
    public void back() throws IOException {
        Store.login = null;
        Store.password = null;
        Store.age = null;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/fxml/Login.fxml"));
        AnchorPane pane = loader.load();
        Scene scene = new Scene(pane);
        Store.stage.setScene(scene);
    }
}
