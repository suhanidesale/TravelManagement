package com.example.travelmanagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LoginDatabaseConnection {
    public Connection databaseLink;

    public Connection getConnection()
    {
        String databaseName = "TravelManagementSystem";
//      String databaseUser ="demo";
//        String databasePassword = "123456";

        String username= "SuhaniDesale";
        String password= "weFFncnhuzzTmjNZ";

        String url = "jdbc:mysql://jblminiproject-do-user-10209104-0.b.db.ondigitalocean.com:25060/" + databaseName;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url,username,password);
            //PreparedStatement ps = databaseLink.prepareStatement("insert into 'customer'(customer_name , customer_username,pass) values('Suhani','suhani_desale','123456');");
            System.out.println("done");
        } catch (Exception e) {
            e.printStackTrace();
           // e.getCause();
            System.out.println("not done");
        }


        return databaseLink;
    }

}
//jdbc:mysql://localhost:3306/?user=root
/*
username = SuhaniDesale
password = weFFncnhuzzTmjNZ hide
host = jblminiproject-do-user-10209104-0.b.db.ondigitalocean.com
port = 25060
database = TravelManagementSystem
sslmode = REQUIRED
 */