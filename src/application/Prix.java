package application;

public class Prix {
    private double prixHT;
    private double tva;

    public Prix(int i, int i1) {
        this.prixHT = i;
        this.tva = i1;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    public double getTva() {
        return tva;
    }

    public double getPrixTTC(){
        return this.getPrixHT() +this.prixHT;
    }

    @Override
    public String toString() {
        return "prix{" +
                "prixHT=" + prixHT +
                ", tva=" + tva +
                '}';
    }

    public void affiche(){
         System.out.println(toString());
    }
}
