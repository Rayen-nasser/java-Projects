package ExDocument;

public class Dictionnaire extends Document {
    private String langue;
    private int nombre_tomes;

    public Dictionnaire( String titre, String langue, int nombre_tomes) {
        super( titre);
        this.langue = langue;
        this.nombre_tomes = nombre_tomes;
    }

    public String getLangue() {
        return langue;
    }

    public int getNombre_tomes() {
        return nombre_tomes;
    }

    public String toString() {
        return super.toString() + ", Langue : " + langue + ", Nombre de tomes : " + nombre_tomes;
    }
}