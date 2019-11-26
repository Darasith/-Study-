/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5DTOobject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sith
 */
public class DTOclass2 {
    
    private int id;
    private String name;
    //DTOclass2 ob = null;
    
    ArrayList <DTOclass2> ls = new ArrayList();
    Statement st = null;
    
    public void input(){
       
        Scanner inp = new Scanner(System.in);
        
        int n;
        
        System.out.println("How many record you want to put?");
        n = inp.nextInt();
        
        for (int i=0 ; i<n ; i++){
            DTOclass2 obj = new DTOclass2();
            System.out.print("Enter the ID:");
            obj.setid(inp.nextInt());
            System.out.print("Enter the name");
            obj.setname(inp.next());
            ls.add(obj);
            
        }
        
    }
    
    public void setid(int id){
        this.id = id;
    }
    public int getid(){
        return this.id;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return this.name;
    }
    
    public void insertinput() throws SQLException{
        String inputs="";

        for(DTOclass2 o :ls){
            inputs = "insert into getvalue values ('"+o.getid()+"','"+o.getname()+"')";
            st.execute(inputs);
        }
    }
    public void getconnection() throws ClassNotFoundException, SQLException{
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/modelclass", "root", "");
        st = con.createStatement();
    }
}
