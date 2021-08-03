package pl.camp.it.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import pl.camp.it.App3;
import pl.camp.it.Store;

import java.io.IOException;

public class LoginController {

    @FXML
    TextField loginTextField;

    @FXML
    TextField passwordTextField;

    @FXML
    TextField ageTextField;

    @FXML
    Button okButton;

    @FXML
    public void authenticate() throws IOException {
        if(loginTextField.getText().equals("admin") &&
        passwordTextField.getText().equals("admin") &&
        !ageTextField.getText().equals("")) {
            Store.login = loginTextField.getText();
            Store.password = passwordTextField.getText();
            Store.age = ageTextField.getText();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(this.getClass().getResource("/fxml/Ok.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);
            Store.stage.setScene(scene);
        }
    }
}
