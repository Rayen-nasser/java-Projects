package application;

public class Produit {
    private String reference;
    private String designation;

    public Produit(String number, String punch) {
        this.reference = number;
        this.designation = punch;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReference() {
        return reference;
    }

    public String affiche() {
        return this.reference + " " + this.designation;
    }
}
