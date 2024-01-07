package Ex2;

public class Document {
    public static int i;
    private String titre;

    private int num_enregistrement;

    public Document(String titre) {
        i++;
        this.num_enregistrement= i;
        this.titre = titre;
    }

    public int getNum_enregistrement() {
        return num_enregistrement;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNum_enregistrement(int num_enregistrement) {
        this.num_enregistrement = num_enregistrement;
    }


    public String toString() {
        return "Document{" +
                "titre='" + titre + '\'' +
                ", num_enregistrement=" + num_enregistrement +
                '}';
    }
}