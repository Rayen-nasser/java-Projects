package PolymophismeEx;

public class Directeur extends Salarier{

    private Double salaier ;

    public Directeur(String n) {
        super(n);
        this.salaier = 12000.0;
    }

    public Double getSalaier() {
        return salaier;
    }

    @Override
    public void afficheSalaire() {
        super.afficheSalaire();
    }
}
