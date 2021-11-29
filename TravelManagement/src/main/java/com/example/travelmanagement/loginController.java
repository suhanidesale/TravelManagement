//package com.example.travelmanagement;
//import javafx.scene.Node;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.TextField;
//import javafx.stage.Stage;
//import javafx.scene.Scene;
//import javax.xml.transform.Result;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.control.PasswordField;
//
//import javafx.event.ActionEvent;
//import java.sql.*;
//
//public class loginController extends NullPointerException{
//
//    @FXML
//    private Button enterbutton;
//
//    @FXML
//    private Button cancelbutton;
//    @FXML
//    private Button signupbutton;
//    @FXML
//    private Button loginbutton;
//    @FXML
//    private Label invalidlogin;
//    @FXML
//    private TextField username;
//    @FXML
//    private PasswordField password;
//
//    @FXML
//    public void enterButtonOnAction(ActionEvent event)  {
//        //checklogin();
//
//        if (!username.getText().isBlank() && !password.getText().isBlank() ){
//            validatelogin(event);
//
//        } else {
//            invalidlogin.setText("Invalid Username Or Password");
//        }
//    }
//
//
//    public void validatelogin(ActionEvent event) {
//        LoginDatabaseConnection connectnow = new LoginDatabaseConnection();
//        //Connection connectDB = DriverManager.getConnection("jdbc:mysql://jblminiproject-do-user-10209104-0.b.db.ondigitalocean.com", "purpleven", "DxWTYB7IuaiGe0BS");
//        Connection connectdb = connectnow.getConnection();
//        //Connection connectDB = DriverManager.getConnection("jblminiproject-do-user-10209104-0.b.db.ondigitalocean.com", "purpleven", "DxWTYB7IuaiGe0BS");
//
//        String verifyLogin = "SELECT COUNT(1) FROM customer WHERE customer_username = ' " +username.getText()+ " ' AND pass =  ' " +password.getText()+ " ' ";
//        // String verfiyLogin = "select count(1) from customer where customer_name = '" + username.getText() + "'AND pass= '" + password.getText()+ "'";
//        //select * from customer where customer_username = 'tayyabali' and pass = '1234567';
//
//        try {
//
//            Statement statement = connectdb.createStatement();
//            ResultSet queryResult = statement.executeQuery(verifyLogin);
//
//            while (queryResult.next()){
//                if(queryResult.getInt(1) == 1){
//                    invalidlogin.setText("Welcome!");
//                    //Parent root = FXMLLoader.load(getClass().getResource("profile.fxml"));
//                }
//                else if(username.getText().isEmpty() && password.getText().isEmpty())
//                {
//                    invalidlogin.setText("Please enter your data.");
//                }
//
//                else{
//                    invalidlogin.setText("Invalid Login!");
//                }
//            }
//        }catch (Exception ep){
//            ep.printStackTrace();
//        }
//    }
//    public void usersignup(ActionEvent event) throws IOException{
//        loginmain m=new loginmain();
//        m.changeScene("signup.fxml");
//
//    }
//    public void userlogin(ActionEvent event) throws IOException {
//        loginmain m = new loginmain();
//        m.changeScene("login.fxml");
//    }
//
//
//    public void cancelButtonOnAction(ActionEvent e){
//        Stage stage = (Stage)cancelbutton.getScene().getWindow();
//        stage.close();
//
//    }
//
////    public void validatelogin() throws SQLException {
////        LoginDatabaseConnection connectNow = new LoginDatabaseConnection();
////        //Connection connectDB = DriverManager.getConnection("jdbc:mysql://jblminiproject-do-user-10209104-0.b.db.ondigitalocean.com", "purpleven", "DxWTYB7IuaiGe0BS");
////        Connection connectDB = connectNow.getConnection();
////        //Connection connectDB = DriverManager.getConnection("jblminiproject-do-user-10209104-0.b.db.ondigitalocean.com", "purpleven", "DxWTYB7IuaiGe0BS");
////
////        String verifyLogin = "SELECT COUNT(1) FROM customer WHERE customer_name = ' " +username.getText()+ " ' AND pass =  ' " +password.getText()+ " ' ";
////       // String verifyLogin = "select count(1) from customer where customer_name = '" + username.getText() + "'AND pass= '" + password.getText()+ "'";
////
////        try {
////
////            Statement statement = connectDB.createStatement();
////            ResultSet queryResult = statement.executeQuery(verifyLogin);
////
////            while (queryResult.next()){
////                if(queryResult.getInt(1) == 1){
////                    invalidlogin.setText("Welcome!");
////                    //Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
////                }
////                else if(username.getText().isEmpty() && password.getText().isEmpty())
////                {
////                    invalidlogin.setText("Please enter your data.");
////                }
////
////                else{
////                    invalidlogin.setText("Invalid Login!");
////                }
////            }
////        }catch (Exception e){
////            e.printStackTrace();
////        }
////    }
//}
//
//
//
//
//
//
//
//
//

package com.example.travelmanagement;
import javafx.scene.Node;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public  class loginController extends NullPointerException {
    @FXML
    private Label invalidlogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    @FXML
    private Button cancelbutton;

    @FXML
    public void enterButtonOnAction(ActionEvent e) {

        if (!username.getText().isBlank() && !password.getText().isBlank()) {
            validatelogin(e);

        } else {
            invalidlogin.setText("Invalid Username Or Password");
        }
    }

    @FXML
    public void usersignup(ActionEvent e) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signup.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }

    public void validatelogin(ActionEvent e) {
        LoginDatabaseConnection connectnow = new LoginDatabaseConnection();
        Connection connectdb = connectnow.getConnection();
        String verifylogin = "select count(1) from signup where customer_username='" + username.getText() + "' and pass='" + password.getText() + "'";
        try {
            Statement statement = connectdb.createStatement();
            ResultSet queryResult = statement.executeQuery(verifylogin);
            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    invalidlogin.setText("Login Successfull");
                    try {

                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("homepage.fxml"));
                        ((Node) (e.getSource())).getScene().getWindow().hide();
                        Parent root1 = fxmlLoader.load();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root1));
                        stage.show();
                    } catch (Exception ep) {
                        ep.printStackTrace();
                    }
                } else {
                    invalidlogin.setText("invalid");
                }
            }
        } catch (Exception ep) {
            ep.printStackTrace();
        }

    }

    public void userlogin(ActionEvent event) {

    }

    public void cancelButtonOnAction(ActionEvent event) {

        Stage stage = (Stage) cancelbutton.getScene().getWindow();
        stage.close();


    }
}

