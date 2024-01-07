package ExDocument;

public class Livre extends Document {
    private String auteur;
    private int nb_pages;

    public Livre( String titre, String auteur, int nombre_pages) {
        super( titre);
        this.auteur = auteur;
        this.nb_pages = nombre_pages;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNb_pages() {
        return nb_pages;
    }

    @Override
    public String toString() {
        return super.toString() + ", Auteur : " + auteur + ", nomber de pages : " + nb_pages;
    }
}