/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sith
 */
public class jdbc3 {
    public static void main(String a[]) throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Scanner inp = new Scanner(System.in);
            ArrayList <DTOclass> list = new ArrayList();
            System.out.println("Driver loaded");
            
            System.out.println("Enter a number");
            int n = inp.nextInt();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/modelclass", "root", "");
            Statement st = con.createStatement();
            
            
            for (int i = 0 ; i < n ; i++){
                DTOclass obj = new DTOclass();
                System.out.println("Record" + i);
                System.out.println("Name");
                obj.setname(inp.next());
                System.out.println("ID");
                obj.setid(inp.nextInt());
                list.add(obj);
            }
            for(DTOclass o :list){
                String comman = "insert into getvalue values('"+o.getid()+"','"+o.getname()+"')";
                st.execute(comman);
            }
            
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
