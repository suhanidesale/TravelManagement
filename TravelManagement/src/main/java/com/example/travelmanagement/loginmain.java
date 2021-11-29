package com.example.travelmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class loginmain extends Application {
    private static Stage stg;
    @Override
    public void start(Stage stage) throws Exception {
        stg=stage;
        //stage.setResizable(false);
        Parent root=FXMLLoader.load(getClass().getResource("login.fxml"));
        stage.setTitle("login page");
        stage.setScene(new Scene(root,600,400));
        stage.show();
    }
    public void changeScene(String fxml) throws IOException{
        Parent pane=FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch();
    }
}