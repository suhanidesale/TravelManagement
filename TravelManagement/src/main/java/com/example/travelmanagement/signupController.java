package com.example.travelmanagement;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.sql.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
public  class signupController extends NullPointerException
{
    @FXML
    private Label label;
    @FXML
    private TextField username;
    @FXML
    private TextField lastname;
    @FXML
    private TextField firstname;
    @FXML
    private TextField email;
    @FXML
    private PasswordField pass;
    @FXML
    private PasswordField cpass;
//public void signupbuttononaction(ActionEvent actionEvent) {
//    }
    @FXML
    public void savebuttononaction(ActionEvent actionEvent)
    {
        String Username=username.getText();
        String Firstname=firstname.getText();
        String Lastname=lastname.getText();
        String Email=email.getText();
        String Password=pass.getText();
        String Confirmpassword=cpass.getText();
        LoginDatabaseConnection connectnow = new LoginDatabaseConnection();
        Connection connectdb = connectnow.getConnection();
        PreparedStatement psinsert=null;
        PreparedStatement pscheck=null;
        ResultSet resultSet=null;

        try
        {
            pscheck=connectdb.prepareStatement("select * from signup where username= ?");
            pscheck.setString(1,Username);
            resultSet=pscheck.executeQuery();
            if(resultSet.isBeforeFirst())
            {
                System.out.println("User Already Exists...");
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setContentText("YOU CANNOT USE THIS USERNAME.");
                alert.show();
            }
            else
            {

                psinsert = connectdb.prepareStatement("insert into signup VALUES (?,?,?,?,?,?)");
                psinsert.setString(1, Username);
                psinsert.setString(2, Firstname);
                psinsert.setString(3, Lastname);
                psinsert.setString(4, Email);
                psinsert.setString(5, Password);
                psinsert.setString(6, Confirmpassword);
                psinsert.executeUpdate();
                label.setText("Details Saved Successfully!");



            }
        }catch(SQLException ep)
        {
            ep.printStackTrace();
        }

    }







    public void userlogin(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
            ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }

    public void usersignup(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signup.fxml"));
            ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }

    }

//    public void signupbuttononaction(ActionEvent actionEvent) {
//    }
}
