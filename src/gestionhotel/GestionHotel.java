/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionhotel;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ordinateur
 */
public class GestionHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
       Connection con = null;
       Statement st= null;
       try{
       con = ConnectionDatabase.getCon();
       st= con.createStatement();
       st.executeUpdate("Create table Users(nom varchar(50),email varchar(50),motdepasse varchar(50),securityQuestion varchar(50),repense varchar(50),adresse varchar(50),status varchar(50))");
       
       st.executeUpdate("Create table Room(roomNo varchar(50),roomType varchar(50),bed varchar(50),price int,status varchar(20))");
       st.executeUpdate("create table customer(id int,name varchar(200),mobileNumber varchar(20),nationality varchar(200),gender varchar(50),email varchar(200),idProof varchar(200),adress varchar(500),checkIn varchar(50),roomNo varchar(10),bed varchar(200),roomType varchar(200),pricePerDay int(10),numberofDaysStay int(10),totalAmount varchar(200),checkout varchar(50))");
       JOptionPane.showMessageDialog(null,"Table Created Successfully");
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
       finally{
             try{con.close();
                 st.close();
             }
             catch(Exception e){
             }
       }
    }
    
}
