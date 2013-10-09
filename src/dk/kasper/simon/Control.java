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
import javax.swing.JLabel;

/**
 *
 * @author Simon
 */
public class Control {

    private static Scanner fileScan, inputScan;
    private FileWriter out;
    private PrintWriter pw;
    private ArrayList<Person> persons;
    private String path;
    private boolean saveState;

    public Control() {
        this.saveState = false;
        persons = new ArrayList();
        initialSetup();
    }

    public boolean createPerson(String n, int a, int b, int c, int d, JLabel l) {
            Person person = new Person(n, a, b, c, d);
            this.persons.add(person);
            l.setText("Person created succesfully");
            this.saveState = true;
            return false;
        }
    

    public boolean getSaveState() {
        return this.saveState;
    }

    public Person giveArray(int x) {
        return persons.get(x);
    }

    public int arraySize() {
        return persons.size();
    }
    
    public boolean checkInputs(String n, int a, int b, int c, int d, JLabel l){
    if (a <= 0 || b <= 0 || c <= 0 || d <= 0) {
            l.setText("Assigned values must be above 0");
            return true;
        } else if ((a + b + c + d) >= 100) {
            l.setText("The total score must not be over 100");
            return true;
        } else if (n == null) {
            l.setText("Fill in name!");
            return true;
        } else {
            return false;
        }
    }
    
    
    public void deletePerson(Person p, JLabel l) {
        for (int x = 0; x < persons.size(); ++x) {
            if (persons.get(x).equals(p)) {
                this.saveState = true;
                persons.remove(x);
                l.setText("Person deleted from the list");
            }
        }
    }


    public void loadFromFile() {
        try {
            this.persons = new ArrayList();
            fileScan = new Scanner(new File(path));
            while (fileScan.hasNext()) {
                String tmp = fileScan.next();
                String[] tokens = tmp.split(",");
                String l = tokens[0];
                int ad = Integer.parseInt(tokens[1]);
                int an = Integer.parseInt(tokens[2]);
                int cr = Integer.parseInt(tokens[3]);
                int fi = Integer.parseInt(tokens[4]);
                persons.add(new Person(l, ad, an, cr, fi));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Could not load file.");
        } catch (Exception e) {
            System.out.println("Unknown error: " + e);
        }
    }

    public void saveToFile(JLabel text) {
        try {
            pw = new PrintWriter(path);
            for (int x = 0; x < persons.size(); ++x) {
                pw.write(persons.get(x).toFile());
                pw.println("");
            }
            this.saveState = false;
            pw.close();
            text.setText("Files succesfully saved.");
        } catch (FileNotFoundException ex) {
            text.setText("Could not find file.");
        } catch (Exception e) {
            text.setText("An unknown eroor occured.");
        }
    }

    public boolean checkSecret() {
        try {
            fileScan = new Scanner(path);
            String dp = "Dread Pirate";
            String tmp = fileScan.findInLine(dp);
            if (tmp.equalsIgnoreCase(tmp)) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
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
            this.path = sb.toString();
        } catch (Exception e) {
            System.out.println("Could not create file");
        }
    }
}
