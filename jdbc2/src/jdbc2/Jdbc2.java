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
public class Jdbc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
//        try {
//            // TODO code application logic here
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Driver loaded");
//            
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kitnewdb","root","");
//            
//            System.out.println("Enter id and uname");
//            Scanner inp = new Scanner(System.in);
//            String id = inp.next();
//            String name = inp.next();
//            
//            Statement st = con.createStatement();
//            st.execute("insert into b6b values('"+id+"','"+name+"')");
//           
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }
          try{
              String name;
              int id;
              
              Class.forName("com.mysql.jdbc.Driver");
              System.out.println("Driver loaded");
              
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/modelclass", "root", "");
              
              Scanner inp = new Scanner (System.in);
              DTOclass o = new DTOclass();
              
              
              System.out.println("Enter a number");
              id = inp.nextInt();
              System.out.println("Enter a name");
              name = inp.next();
              o.setname(name);
              o.setid(id);
              
              Statement st = con.createStatement();
              st.execute("insert into getvalue values ('"+o.getid()+"','"+o.getname()+"')");
          }catch(Exception ex){
              System.out.println(ex.getMessage());
          }
    }
    
}