package PolymophismeEx;

public class Chef extends Salarier{

    private Double salaier;

    public Chef(String n) {
        super(n);
        this.salaier = 15000.0;
    }

    public Double getSalaier() {
        return salaier;
    }
}
