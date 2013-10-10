/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.kasper.simon;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Simon
 */
public class ArrHereBeSecrets {
    private static Font font;
    private static Random rnd;
    private String[] titles;

    public ArrHereBeSecrets() {
        titles = new String[]{"Salty Seadog ", "Timber Fiddler", "Landlubber", "Dread Pirate ", "Cap'n ",
            "Scurvy Dog ", "Peglegged ", "Cutthroat ", "Deck swapper"};
        rnd = new Random();
        font = new Font("Papyrus",Font.PLAIN,12);
    }

    public String ArrGetReadyYaLandlubber() {
        int x = rnd.nextInt(titles.length);
        return titles[x];
    }

    public Person dreadPirate(boolean del, Person p) {
        p = new Person("Wirt", 1000, 1000, 1000, 1000);
        return p;
    }

    public void walkThePlank() {
    }

    public void captainMorgan() {
    }

    public void fiddleMeTimber() {
    }

    public String ohayThar(Person person) {
        StringBuilder sb = new StringBuilder();
        sb.append("Yer name: \t");
        sb.append(person.toString()).append("\n");
        sb.append("Commandering - keep the crew from mutinying: \t");
        sb.append(person.getAdmin()).append("\n");
        sb.append("Navigation - You can read a map and row a boat: \t");
        sb.append(person.getAnalyst()).append("\n");
        sb.append("Carousing - Yer voice is just slightly less terrible than others: \t");
        sb.append(person.getCreative()).append("\n");
        sb.append("SwashBuckling - You know how to swing ya sword and actually hit: \t");
        sb.append(person.getFinisher());
        return sb.toString();
    }

    public void ArrIBeNeedinANewPaintjobForMeBoat(JPanel a, JPanel b, JPanel c, JDialog d) {
        a.setBackground(Color.decode("#8b4513"));
        b.setBackground(Color.decode("#8b4513"));
        c.setBackground(Color.decode("#8b4513"));
        d.setBackground(Color.decode("#8b4513"));
    }

    public void ArrWhatBecomeOfMeCrew(JButton cre, JButton edi, JButton del, JLabel view, JLabel app, JMenu help, JMenu file) {
        cre.setText("New Crew");
        cre.setToolTipText("Hire yer new freshman crewmembers");
        cre.setFont(font);
        edi.setText("You lying..");
        edi.setToolTipText("We ain't tolerating no lying filthy dog, make him fill it out proper.");
        edi.setFont(font);
        del.setText("Keelhaul");
        del.setToolTipText("Keelhaul that filty landlubber, take him down to the deepst below!");
        del.setFont(font);
        view.setToolTipText("The filthy scum aint worth one stinkin pice of gold");
        view.setText("See your filthy Sea Dogs here");
        view.setFont(font);
        app.setToolTipText("Hire ");
        app.setText("The Crew");
        app.setFont(font);
        help.setText("HELP!!!");
        file.setText("Where's the rum");
    }

    public void ArrChangeSomeTitles(JLabel na, JLabel ad, JLabel cre, JLabel an, JLabel fin, JLabel text1, JLabel text2, JButton one, JButton two) {
        na.setText("Crew Name");
        na.setFont(font);
        ad.setText("Commandering");
        ad.setFont(font);
        an.setText("Navigation");
        an.setFont(font);
        cre.setText("Carousing");
        cre.setFont(font);
        fin.setText("Swashbuckling");
        fin.setFont(font);
        text1.setText("Welcome to the crew you salty seadog. remember!");
        text2.setText("Dont hire certain pirates!");
        text1.setFont(font);
        text2.setFont(font);
        one.setText("Hire");
        one.setFont(font);
        two.setText("Abandon Ship");
        two.setFont(font);
    }

    public void ArrChangeSomeEditTitles(JLabel na, JLabel ad, JLabel cre, JLabel an, JLabel fin, JLabel text1, JLabel text2, JButton one, JButton two) {
        na.setText("Crew Name");
        na.setFont(font);
        ad.setText("Commandering");
        ad.setFont(font);
        an.setText("Navigation");
        an.setFont(font);
        cre.setText("Carousing");
        cre.setFont(font);
        fin.setText("Swashbuckling");
        fin.setFont(font);
        text1.setText("You lied you sea dog.. If i were cap'n i would keelhall you");
        text2.setText("now dont lie about your skills... Pirate");
        text1.setFont(font);
        text2.setFont(font);
        one.setText("Last chance");
        one.setFont(font);
        two.setText("Throw overboard");
        two.setFont(font);
    }
    
    public void learnToWrite(JList list, JTextArea area, JLabel label){
    list.setFont(font);
    area.setFont(font);
    label.setFont(font);
    }
    
}
