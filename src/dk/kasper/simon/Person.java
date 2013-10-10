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
    private static boolean pirateMode;
    
    public Person(String name, int admin, int analyst, int creative, int finisher) {
        this.admin = admin;
        this.analyst = analyst;
        this.creative = creative;
        this.finisher = finisher;
        this.name = name;
    }

    public void setSecretTitle(String secretTitle) {
        this.secretTitle = secretTitle;
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
    
    public String showPerson() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: \t");
        sb.append(name).append("\n");
        sb.append("Administrator: \t");
        sb.append(admin).append("\n");
        sb.append("Analyst: \t");
        sb.append(analyst).append("\n");
        sb.append("Creative: \t");
        sb.append(creative).append("\n");
        sb.append("Finisher: \t");
        sb.append(finisher);
        return sb.toString();
    }

    public String toFile() {
        String person = name + "," + admin + "," + analyst + "," + creative + "," + finisher;
        return person;
    }

    public static void getmode(boolean mode){
        pirateMode = mode;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(pirateMode==true){
        sb.append(this.secretTitle);
        }
        sb.append(this.name);
        return sb.toString();
    }
}
