package PolymophismeEx;

public class Ouvrier extends Salarier{

    private Double salaier;

    public Ouvrier(String n) {
        super(n);
        this.salaier = 10000.0;
    }

    public Double getSalaier() {
        return salaier;
    }
}
