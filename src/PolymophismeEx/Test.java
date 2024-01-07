package PolymophismeEx;

public class Test {
    public static void main(String[] args) {
        Salarier s2 = new Directeur("Ali");
        Salarier s1 = new Chef("Amin");
        Salarier s3 = new Ouvrier("Omar");

        Payement p = new Payement();

        p.setP(s1);
        p.setP(s2);
        p.setP(s3);

        p.rechercheSalaire("Ali");
        p.rechercheSalaire("Sal7");
        p.rechercheSalaire("Omar");

    }
}
