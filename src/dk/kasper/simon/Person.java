/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.kasper.simon;

/**
 *
 * @author Simon
 */
public class Person {
 
    private String name, secretTitle;
    
    private int admin, analyst, creative, finisher;
    
    
    public Person(String name, int admin,int analyst, int creative,int finisher){
        this.admin = admin;
        this.analyst = analyst;
        this.creative = creative;
        this.finisher = finisher;
        this.name = name;   
    }
    
    
    
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.secretTitle).append(this.name);
        return sb.toString();
    }
    
}
