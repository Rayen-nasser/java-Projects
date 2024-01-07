package application;

import java.util.Vector;

public class Magasin implements CalculTotal{
    private String nom;
    Vector<ProduitMagasin> M;

    public Magasin(String nom){
        this.nom = nom;
        M = new Vector<ProduitMagasin>();
    }

    public void ajouter(ProduitMagasin p){
        this.M.add(p);
    }

    public boolean supprimer(int i){
        if(i > 0 || i < M.size()){
            this.M.removeElementAt(i);
            return true;
        }

        return false;
    }

    public void supprimer(String nomProduit){
        boolean ok = false;

        for (ProduitMagasin i : M){
            if(i.getProduit().getDesignation().equals(nomProduit)){
                i.affiche();
                M.remove(i);
                ok = true;
                break;
            }
        }

        if (!ok){
            System.out.println("produit n'exit pas");
        }
    }

    public void supprimerTout(){
        M.clear();
    }

    public int getNbProduit(){
        return M.size();
    }

    public void recherche(String nomProduit){
        boolean ok = false;

        for (ProduitMagasin i : M){
            if(i.getProduit().getDesignation().equals(nomProduit)){
                i.affiche();
                ok = true;
                break;
            }
        }

        if (!ok){
            System.out.println("produit n'exit pas");
        }
        System.out.println("produit exit");
    }

    public void affiche(){
        for (ProduitMagasin p: M){
            p.affiche();
        }
    }

    public int getTotalQuantite(){
        int s = 0;
        for(ProduitMagasin i : M){
            s = s + i.getQuiantite();
        }

        return s;
    }





    @Override
    public double getTotalHT() {
        double s = 0;
        for(ProduitMagasin i : M){
            s = s + i.getTotalHT();
        }

        return s;
    }

    @Override
    public double getTotalTTC() {
        double s = 0;
        for(ProduitMagasin i : M){
            s = s + i.getTotalTTC();
        }

        return s;
    }
}
