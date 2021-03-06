package dk.kasper.simon;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * This class is used entirely for handling the secret easteregg pirate mode.
 * Methods here change the layout of the program, and the proper text to
 * reflect it's pirate theme. No program logic for the vanilla program, is
 * done in this file.
*/
public class ArrHereBeSecrets {

    private static Font font;
    private static Random rnd;
    private static String[] titles = new String[]{"Salty Seadog ", "Timber Fiddler ", "Landlubber ", "Dread Pirate ",
        "Scurvy Dog ", "Peglegged ", "Cutthroat ", "Deck swapper "};

    public ArrHereBeSecrets() {
        rnd = new Random();
        font = new Font("Times New Roman", Font.PLAIN, 12);
    }

    public static String ArrGetReadyYaLandlubber() {
        if (MainFrame.getCaptain()) {
            int x = rnd.nextInt(titles.length);
            return titles[x];
        } else {
            MainFrame.setCaptain(true);
            return "Cap'n ";
        }
    }

    public static Person wirtTheWonderBoy() {
        Person p = new Person("Wirt", 1000, 1000, 1000, 1000, true);
        return p;
    }
    
    public static Person thatMorganFellow(){
        Person p = new Person("Morgan", 15, 15, 15, 15, false);
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
        sb.append("\nCommandering \nKeep the crew from mutinying:\t");
        sb.append(person.getAdmin()).append("\n");
        sb.append("\nNavigation \nYou can read a map and row a boat:\t");
        sb.append(person.getAnalyst()).append("\n");
        sb.append("\nCarousing \nYer voice is just slightly less terrible than others:     ");
        sb.append(person.getCreative()).append("\n");
        sb.append("\nSwashBuckling \nYou know how to swing ya sword and actually hit: ");
        sb.append(person.getFinisher());
        return sb.toString();
    }

    public void ArrIBeNeedinANewPaintjobForMeBoat(JPanel a, JPanel b, JPanel c, JDialog d, JTextArea area, JList list) {
        a.setBackground(Color.decode("#AB4A15"));
        b.setBackground(Color.decode("#AB4A15"));
        c.setBackground(Color.decode("#AB4A15"));
        d.setBackground(Color.decode("#AB4A15"));
        area.setBackground(Color.decode("#E4CA6D"));
        list.setBackground(Color.decode("#E4CA6D"));
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
        help.setFont(font);
        file.setText("Where's the rum");
        file.setFont(font);
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
        text1.setText("You lied you sea dog.. If i were cap'n i would keelhaul you");
        text2.setText("now dont lie about your skills, idiot.");
        text1.setFont(font);
        text2.setFont(font);
        one.setText("Last chance");
        one.setFont(font);
        two.setText("Throw overboard");
        two.setFont(font);
    }

    public void changeTheMenus(JMenuItem sa, JMenuItem lo, JMenuItem qu, JMenuItem ab) {
        sa.setText("Bury the papers!");
        sa.setFont(font);
        lo.setText("Dig up the papers!");
        lo.setFont(font);
        qu.setText("Abandon ship!");
        qu.setFont(font);
        ab.setText("Who did this?!");
        ab.setFont(font);
    }

    public void learnToWrite(JList list, JTextArea area, JLabel label) {
        list.setFont(font);
        area.setFont(font);
        label.setFont(font);
    }
}
