package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML private Label helloWorld;

    public void SayHello(ActionEvent actionEvent) {
        helloWorld.setText("HelloWorld!");
    }
}
