package PolymophismeEx;

public class Salarier {
    protected int id;
    private  String nom;
    private static int i ;
    public Salarier(String n){
        i = i + 1;
        this.id = i;
        this.nom = n;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Salarire{" +
                "nom=" + nom +
                '}';
    }

    public void afficheSalaire(){
        System.out.println(toString());
    }
}
