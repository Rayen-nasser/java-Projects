package ExDocument;

public class Bibliotheque {
    public static void main(String[] args) {

        Livre livre1 = new Livre( "ry", "gigo", 200);
        Dictionnaire dictionnaire1 = new Dictionnaire( "Dictionnaire", "Français", 20);
        ListeDeDocuments liste_documents = new ListeDeDocuments();
        liste_documents.ajouter_document(livre1);
        liste_documents.ajouter_document(dictionnaire1);
        liste_documents.tous_auteurs();
        System.out.println("======================");
        liste_documents.tous_documents();
    }
}