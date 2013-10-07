/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.kasper.simon;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Simon
 */
public class Control {
    
    private Scanner fileScan,inputScan;
    private FileWriter out;
    private PrintWriter pw;
    private ArrayList<Person> persons;
    private String path;
    
    public Control(){
        initialSetup();
    }
    
    
    private void initialSetup(){
        String dir = System.getProperty("user.dir");
        String fileDir = dir+"/persons";
        File file;
        try{
            file = new File(fileDir);
            if(!file.exists()){
                file.mkdir();
                this.path = fileDir;
            }else{
                this.path = fileDir;
            }
        }catch(Exception e){}   
    }
    
    
    
    public Person createPerson(String n, int a, int b, int c, int d){
        Person person = new Person(n,a,b,c,d);
        
        try{
            pw = new PrintWriter(new FileWriter("name.txt"));
            
        
        
        
        }catch(FileNotFoundException ex){
        
        
        }catch(Exception e){
        
        }
        
        
        
        
        
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
