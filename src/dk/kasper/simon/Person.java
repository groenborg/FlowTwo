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
    public void setName(String name) {
        this.name = name;
    }

    public void setSecretTitle(String secretTitle) {
        this.secretTitle = secretTitle;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public void setAnalyst(int analyst) {
        this.analyst = analyst;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public void setFinisher(int finisher) {
        this.finisher = finisher;
    }

    public int getAdmin() {
        return admin;
    }

    public int getAnalyst() {
        return analyst;
    }

    public int getCreative() {
        return creative;
    }

    public int getFinisher() {
        return finisher;
    }
    
    public String toFile(){
        String person = name+","+admin+","+analyst+","+creative+","+finisher;
        return person;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        return sb.toString();
    }
    
}
