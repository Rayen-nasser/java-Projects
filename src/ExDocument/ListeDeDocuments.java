package ExDocument;

import java.util.ArrayList;
public class ListeDeDocuments {
    private ArrayList<Document> liste_documents;

    public ListeDeDocuments() {
        this.liste_documents = new ArrayList<Document>();
    }

    public void ajouter_document(Document document) {
        this.liste_documents.add(document);
    }

    public void tous_auteurs() {
        for (Document document : liste_documents) {
            if (document instanceof Livre) {
                Livre livre = (Livre) document;
                System.out.println("Numéro de document : " + livre.getNum_enregistrement() + ", Auteur : " + livre.getAuteur());
            }
        }
    }

    public void tous_documents() {
        for (Document document : liste_documents) {
            System.out.println(document.toString());
        }
    }
}