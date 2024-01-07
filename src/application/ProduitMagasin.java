package application;

public class ProduitMagasin implements CalculTotal {
    private int quiantite;
    private Produit produit;
    private Prix prix;

    public ProduitMagasin(int i, Produit pro1, Prix prix1) {
        this.quiantite = i;
        this.produit = pro1;
        this.prix = prix1;
    }

    public void setPrix(Prix prix) {
        this.prix = prix;
    }

    public int getQuiantite() {
        return quiantite;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setQuiantite(int quiantite) {
        this.quiantite = quiantite;
    }

    public Prix getPrix() {
        return prix;
    }




    public void affiche(){
        System.out.println(toString());
    }

    @Override
    public double getTotalHT() {
        return this.quiantite * this.prix.getPrixHT();
    }

    @Override
    public double getTotalTTC() {
        return this.quiantite * this.prix.getPrixTTC();
    }
}
