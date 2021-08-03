package pl.camp.it;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Pierwsza apka");
        stage.setWidth(400);
        stage.setHeight(300);
        stage.setResizable(false);

        Button button = new Button("Przycisk1");
        button.setOnAction(ae -> System.out.println("Kliknięto !!"));

        CheckBox checkBox = new CheckBox("Cos");

        FlowPane flowPane = new FlowPane();

        flowPane.getChildren().add(button);
        flowPane.getChildren().add(checkBox);

        Scene scene = new Scene(flowPane);

        stage.setScene(scene);

        stage.show();
    }
}
