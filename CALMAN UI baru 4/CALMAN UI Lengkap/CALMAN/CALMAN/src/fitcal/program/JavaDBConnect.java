/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcal.program;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class JavaDBConnect {
    

   
    
    public static void main(String[] args){

    Connection con;
    PreparedStatement pst;
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fitcal", "root", "Valen16$");
            System.out.println("Success");
        } catch (SQLException ex) {
            Logger.getLogger(JavaDBConnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JavaDBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    
}
