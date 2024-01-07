package PolymophismeEx;

import java.util.Vector;

public class Payement {
    Vector<Salarier> P;

    public Payement (){
        P = new Vector<Salarier>();
    }

    public void setP(Salarier p) {
        P.add(p);
    }

    public void rechercheSalaire(String nom){
        boolean ok = false;
        for(Salarier sl: P){
            if(sl.getNom().equals(nom)){

               if( sl instanceof Chef){
                   System.out.println("id: " + sl.id + " nom: "+ nom + ", salaire: "+ ((Chef) sl).getSalaier());
               } else if (sl instanceof Ouvrier) {
                   System.out.println("id: " + sl.id +" nom: "+ nom + ", salaire: "+ ((Ouvrier) sl).getSalaier());
               }else {
                   System.out.println("id: " + sl.id +" nom: "+ nom + ", salaire: "+ ((Directeur) sl).getSalaier());
               }

                ok = true;
                break;
            }
        }

        if(!ok){ System.out.println("not found"); }
    }


}
