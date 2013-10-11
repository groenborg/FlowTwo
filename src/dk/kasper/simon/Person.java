package dk.kasper.simon;

/*
 * This class makes a person, to be put into the list. Logic here is keept to
 * a minimum, andmost methods are here to return values for other methods.
*/
public class Person {

    private String name, secretTitle;
    private int admin, analyst, creative, finisher;
    private static boolean pirateMode;

    public Person(String name, int admin, int analyst, int creative, int finisher, boolean cap) {
        this.admin = admin;
        this.analyst = analyst;
        this.creative = creative;
        this.finisher = finisher;
        this.name = name;
        if ("Wirt".equals(name)){
            this.secretTitle = "Peglegged ";
        } else {
            this.secretTitle = ArrHereBeSecrets.ArrGetReadyYaLandlubber();
        }
    }

    public String getSecretTitle() {
        return this.secretTitle;
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

    public static void getmode(boolean mode) {
        pirateMode = mode;
    }

    public String toFile() {
        String person = name + "," + admin + "," + analyst + "," + creative + "," + finisher;
        return person;
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

    @Override
    public String toString() {
        if (pirateMode == true) {
            return this.secretTitle + this.name;
        }
        return this.name;
    }
}
