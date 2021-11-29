package com.example.travelmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.paint.Paint;

import java.io.IOException;

public class profileController {


    public void backbuttononaction(ActionEvent event) throws IOException {
        loginmain m = new loginmain();
        m.changeScene("homepage.fxml");

    }
    public void savebuttononaction(ActionEvent event) throws IOException {
        loginmain m = new loginmain();
        m.changeScene("homepage.fxml");

    }
}
