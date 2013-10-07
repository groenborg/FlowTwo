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

    private Scanner fileScan, inputScan;
    private FileWriter out;
    private PrintWriter pw;
    private ArrayList<Person> persons;
    private String path;

    public Control() {
        initialSetup();
    }

    

    public Person createPerson(String n, int a, int b, int c, int d) {
        Person person = new Person(n, a, b, c, d);

        try {
            pw = new PrintWriter(new FileWriter("name.txt"));
            
            
        } catch (FileNotFoundException ex) {
            
        } catch (Exception e){
            
        }





        persons.add(person);
        return person;
    }

    public void deletePerson(Person name) {
        for (int x = 0; x < persons.size(); ++x) {
            if (persons.get(x).equals(name)) {
                persons.remove(x);
            }
        }
    }

    public void loadFromFile() {
        
    }
    
    
    
    
    private void initialSetup() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.getProperty("user.dir"));
        sb.append("/persons");
        String dir = sb.toString();
        File file;
        try {
            file = new File(dir);
            if (!file.exists()) {
                file.mkdir();
                this.path = dir;
            } else {
                this.path = dir;
            }
        } catch (Exception e) {
            System.out.println("Could not create directory");
        }
        try {
            sb.append("/person.txt");
            file = new File(sb.toString());
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Could not create file");
        }
    }
}
