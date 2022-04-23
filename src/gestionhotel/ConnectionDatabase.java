package gestionhotel;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionDatabase {
    public static Connection getCon(){
        try{
       
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            return conn;
        }
        catch(Exception e)
        {
        return null;
        }
    }
}