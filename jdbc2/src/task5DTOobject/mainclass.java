///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package task5DTOobject;
//
//import java.sql.SQLException;
//import java.util.Scanner;
//
///**
// *
// * @author sith
// */
//public class mainclass {
//        public static void main(String args[]) throws ClassNotFoundException, SQLException{
//            Scanner inp = new Scanner(System.in);
//            System.out.print("Enter function: ");
//            int n = inp.nextInt();
//                    
//            DTOclass1 obj = new DTOclass1();
//
//            System.out.println("Enter id");
//            obj.setid(inp.nextInt());
//            System.out.println("Enter name");
//            obj.setname(inp.next());
//
//            try{
//                obj.getconnection();
//                obj.insertrecord(obj);
//    //            obj.lub(obj);
//            }catch(Exception ex){
//                System.out.println(ex.getMessage());
//
//            }   
//        }
//}