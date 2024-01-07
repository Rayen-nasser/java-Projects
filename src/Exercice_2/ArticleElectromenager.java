package Exercice_2;

public class ArticleElectromenager extends Article implements vendablePiece,solde {
    public int stock;

    public ArticleElectromenager(double pA, double pV, String n, String f) {
        super(pA, pV, n, f);
    }

    // nouvelles méthodes
    public double RemplirStock(int qte) {
        stock = stock + qte;
        return super.prixAchat * qte;
    }

    @Override
    public void StartSolde(double Pourcentage) {
        super.prixVente = super.prixVente * Pourcentage/100;
    }

    @Override
    public void EndSolde(double Pourcentage) {
        super.prixVente = super.prixVente * Pourcentage/100;
        stock = 0;
    }

    @Override
    public double vendre(int qte) {
        if (qte<stock) {
            stock = stock - qte;
            return qte * super.prixVente;
        }
        else {
            System.out.println("Stock insuffisant.");
            return 0;
        }

    }
}
