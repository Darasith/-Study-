/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sith
 */
public class jdbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {

          try{
              Class.forName("com.mysql.jdbc.Driver");
              System.out.println("Driver loaded");
              
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kitnewdb", "root", "");
              Statement st = con.createStatement();
              st.execute("delete from b6b where id");
          }catch(Exception ex){
              System.out.println(ex.getMessage());
          }
    }
    
}