/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.kasper.simon;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Simon
 */
public class Control {
    
    private Scanner fileScan,inputScan;
    private PrintWriter pw;
    private ArrayList<Person> persons;
    
    public Control(){
        
    }
    
    
    public Person createPerson(String n, int a, int b, int c, int d){
        Person person = new Person(n,a,b,c,d);
        persons.add(person);
        return person;
    }
    
    
    
    public void deletePerson(Person name){
        for(int x = 0; x<persons.size();++x){
            if(persons.get(x).equals(name)){
                persons.remove(x);
            }
        }
    }
    
    
    public void loadFromFile(){
    
    
    }
    
    
}
