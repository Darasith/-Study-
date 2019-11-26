/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc2;

/**
 *
 * @author sith
 */
public class DTOclass {
    private String dname;
    private int did;
    
    public void setid(int num){
        this.did = num;
    }
    public int getid(){
        return this.did;
    }
    
    public void setname(String namae){
        this.dname = namae;
    }
    public String getname(){
        return this.dname;
    }
}
