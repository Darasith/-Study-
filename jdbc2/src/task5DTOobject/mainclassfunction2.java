/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5DTOobject;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sith
 */
public class mainclassfunction2 {
    public static void main(String args[]) {
        DTOclass2 obj2 = new DTOclass2();
        System.out.println("runme");
        obj2.input();
        try {
            obj2.getconnection();
             obj2.insertinput();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mainclassfunction2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mainclassfunction2.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
