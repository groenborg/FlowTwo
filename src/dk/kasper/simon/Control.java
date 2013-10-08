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

    private static Scanner fileScan, inputScan;
    private FileWriter out;
    private PrintWriter pw;
    private ArrayList<Person> persons;
    private String path;

    public Control() {
        initialSetup();
    }

    public Person createPerson(String n, int a, int b, int c, int d) {
        Person person = new Person(n, a, b, c, d);
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
        fileScan = new Scanner(path);
        try {
            while (fileScan.hasNext()) {
                String tmp = fileScan.nextLine();
                String[] tokens = tmp.split(",");
                int ad = Integer.parseInt(tokens[1]);
                int an = Integer.parseInt(tokens[2]);
                int cr = Integer.parseInt(tokens[3]);
                int fi = Integer.parseInt(tokens[4]);
                persons.add(new Person(tokens[0], ad, an, cr, fi));
            }
        } catch (Exception e) {
            System.out.println("Could not load file");
        }
    }

    public void saveToFile() {
        try {
            pw = new PrintWriter(path);
            for (int x = 0; x < persons.size(); ++x) {
                pw.write(persons.get(x).toFile());
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("Error in writing to file");
        }
    }

    public String showPerson(Person person) {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: \t");
        sb.append(person.toString()).append("\n");
        sb.append("administrator: \t");
        sb.append(person.getAdmin()).append("\n");
        sb.append("Analyst: \t");
        sb.append(person.getAnalyst()).append("\n");
        sb.append("Creative: \t");
        sb.append(person.getCreative()).append("\n");
        sb.append("Finisher: \t");
        sb.append(person.getFinisher());
        return sb.toString();
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
