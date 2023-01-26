package org.centrale.note;

import java.util.ArrayList;
import java.util.List;

public class Verif {
    private List<PionVerif> verif;

    public Verif(){
        this.verif = new ArrayList<PionVerif>();
    }

    public Boolean verifLigne(Ligne ligne, Plateau plateau){
        int len = plateau.getEssai().size();
        ArrayList<Boolean> etat = new ArrayList<>();
        ArrayList<Boolean> etatbis = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            etat.add(false);
            etatbis.add(false);
        }
        //Vérfication d'un pion à la bonne place et de la bonne couleur
        for (int i = 0; i<4; i++){
            if (plateau.getCode().get(i).getCouleur() == plateau.getEssai().get(len-1).getChoix().get(i).getCouleur()){
                this.verif.add(new PionVerif(true));
                etat.set(i, true);
                etatbis.set(i, true);
            }
        }
        //Vérification de la couleur des pions lorsqu'ils ne sont pas à la bonne place
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if ((plateau.getCode().get(i).getCouleur() == plateau.getEssai().get(len-1).getChoix().get(j).getCouleur())&&(etat.get(i)==false)&&(etatbis.get(j)==false)){
                    this.verif.add(new PionVerif(false));
                    System.out.println(i+" "+j);
                    etat.set(i, true);
                    etatbis.set(j, true);
                }
            }
        }
        //Vérification si le code a été entièrement trouvé
        int i = 0 ;
        Boolean trouve = true;
        while (i<4){
            if(etat.get(i) == false){
                trouve = false;
            }
            i++;
        }
        return trouve;
        
    }

    
    public List<PionVerif> getVerif() {
        return this.verif;
    }

    public void setVerif(List<PionVerif> verif) {
        this.verif = verif;
    }

    public void afficheVerif(){
        int n = this.verif.size();
        for (int i=0;i<n;i++){
            if (verif.get(i).getCouleur()){
                System.out.print("B ");
            } else {
                System.out.print("M ");
            }
        }
        System.out.println("");
    }


}
