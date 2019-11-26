///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package task5DTOobject;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;
//
///**
// *
// * @author sith
// */
//public class DTOclass1 {
//    private int id;
//    private String name="";
//    Connection con;
//    Statement st;
//    
//    public void setname(String n){
//        System.out.print("name get");
//        this.name = n;
//    }
//    public void setid(int i){
//        System.out.print("id get");
//        this.id = i;
//    }
//    public String getname(){
//        return this.name;
//    }
//    public int getid(){
//        return this.id;
//    }
//    
//    public void getconnection() throws Exception{
//        Class.forName("com.mysql.jdbc.Driver");
//        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/modelclass", "root", "");
//        st = con.createStatement();    
//    }
//    public void insertrecord(DTOclass1 obj) throws SQLException{
//        st.execute("insert into getvalue values('"+obj.getid()+"','"+obj.getname()+"')");
//    }
//    public void lub (DTOclass1 obj) throws SQLException{
//        st.execute("delete from getvalue where id = '"+obj.getid()+"'");
//    }
//    
//    
//}
