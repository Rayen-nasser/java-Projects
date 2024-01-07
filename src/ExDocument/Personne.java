package ExDocument;

public class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected String email;
    protected String telephone;
    protected double salaire;
    private static int comp;
    public Personne(String nom, String prenom, String email, String telephone, double salaire) {
        comp++;
        this.id = comp;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }
    public Personne(){
        comp++;
        this.id = comp;
    }
    public double calculerSalaire(){
        return this.salaire;
    }
    public void afficher(){
        System.out.print(this.nom+" "+this.prenom+" "+this.telephone);
    }
}
