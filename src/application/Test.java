package application;

public class Test {

    public static void main(String[] args) {
        Prix prix1 = new Prix(2000,100);
        Prix prix2 = new Prix(1900,50);
        Prix prix3 = new Prix(1000,500);
        Prix prix4 = new Prix(900,550);
        Produit pro1 = new Produit("654321","punch");
        Produit pro2 = new Produit("123456","punch1");
        Produit pro3 = new Produit("aaaaaa","Smile");
        Produit pro4 = new Produit("zzzzzz","Bento");
        ProduitMagasin P1 = new ProduitMagasin(1000, pro1, prix1);
        ProduitMagasin P2 = new ProduitMagasin(1500, pro2, prix2);
        ProduitMagasin P3 = new ProduitMagasin(1000,pro3,prix3);
        ProduitMagasin P4 = new ProduitMagasin(1000,pro4,prix4);
        Magasin M = new Magasin("AZIZA");
        M.ajouter(P1);
        M.ajouter(P2);
        M.ajouter(P3);
        M.ajouter(P4);
        M.affiche();
        System.out.println(M.getTotalQuantite());
        System.out.println(M.getTotalHT());
        System.out.println(M.getTotalTTC());
        M.recherche("punch");
        M.recherche("Coca");

        if(M.supprimer(0))
            System.out.println("Produit Supprimer");
        M.supprimer("Fanta");
        M.affiche();
    }
}