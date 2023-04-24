package com.example.pctechnika;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button accesuar;

    @FXML
    private Button komp;

    @FXML
    private Button nout;

    @FXML
    void OnClickAcc(ActionEvent event) {
        accesuar.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("accsesuar-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 700, 350);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setTitle("Комп'ютерна техніка!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void OnClickKomp(ActionEvent event) {
        nout.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("komp-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 700, 350);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setTitle("Комп'ютерна техніка!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void OnClickNout(ActionEvent event) {
        nout.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nout-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 700, 350);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setTitle("Комп'ютерна техніка!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void initialize() {

    }

}
