package dk.kasper.simon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JLabel;

/*
 * This class contains most of the programs logic, for creating, editing,
 * and deleting persons, as well as handling filesaving and loading.
 * Handling of the personlist is also done here.
*/

public class Control {

    private static Scanner fileScan;
    private PrintWriter pw;
    private ArrayList<Person> persons;
    private String path;
    private boolean saveState;
    

    public Control() {
        this.saveState = false;
        persons = new ArrayList();
        initialSetup();
    }

    public boolean createPerson(String n, int a, int b, int c, int d, boolean cap) {
        Person person = new Person(n, a, b, c, d, cap);
        this.persons.add(person);
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

    public boolean checkInputs(String n, int a, int b, int c, int d, JLabel l) {
        if (a < 0 || b < 0 || c < 0 || d < 0) {
            l.setText("Assigned values must be at least 0");
            return true;
        } else if ((a + b + c + d) > 30) {
            l.setText("The total score must not be over 30");
            return true;
        } else if (n == null) {
            l.setText("Fill in name!");
            return true;
        } else {
            return false;
        }
    }

    public boolean parserTest(String a, String b, String c, String d, String name, JLabel l) {
        if (a.matches("\\d+") && b.matches("\\d+") && c.matches("\\d+") && d.matches("\\d+")) {
            String tmp = name.replace(" ", "");
            if (tmp.length()>0) {
                return true;
            }
        }
        l.setText("Insert valid name, and make sure all fields only have numbers");
        return false;
    }

    public void deletePerson(Person p, JLabel l) {
        for (int x = 0; x < persons.size(); ++x) {
            if (persons.get(x).equals(p)){
                this.saveState = true;
                l.setText("Person deleted from the list");
                if (p.getSecretTitle().equals("Cap'n ")){
                    MainFrame.setCaptain(false);
                } else if (p.getSecretTitle().equals("Peglegged ") && MainFrame.getSecret()) {
                    Person wirt = ArrHereBeSecrets.wirtTheWonderBoy();
                    this.persons.add(wirt);
                    this.saveState = true;
                    l.setText("The corpse of " + p.toString() + " rises from the dead! Wirt The Peglegged Boy has joind your crew!");
                }
                persons.remove(x);
            }
        }
    }

    public void loadFromFile() {
        try {
            this.persons = new ArrayList();
            fileScan = new Scanner(new File(path));
            while (fileScan.hasNext()) {
                String tmp = fileScan.nextLine();
                String[] tokens = tmp.split(",");
                String l = tokens[0];
                int ad = Integer.parseInt(tokens[1]);
                int an = Integer.parseInt(tokens[2]);
                int cr = Integer.parseInt(tokens[3]);
                int fi = Integer.parseInt(tokens[4]);
                persons.add(new Person(l, ad, an, cr, fi, true));
            }
        } catch (FileNotFoundException ex) {
            
        } catch (Exception e) {
            
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
        }
        try {
            sb.append("/person.txt");
            file = new File(sb.toString());
            file.createNewFile();
            this.path = sb.toString();
        } catch (Exception e) {
        }
    }
}
