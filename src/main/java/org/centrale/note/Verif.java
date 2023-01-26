package org.centrale.note;

import java.util.ArrayList;
import java.util.List;

public class Verif {
    private List<PionVerif> verif;

    public List<PionVerif> getVerif() {
        return this.verif;
    }

    public void setVerif(List<PionVerif> verif) {
        this.verif = verif;
    }

    public Verif(){
        List<PionVerif> verif = new ArrayList<PionVerif>();
    }

    public Boolean verifLigne(Ligne ligne, Plateau plateau){
        int len = plateau.getEssai().size();
        ArrayList<Boolean> etat = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            etat.add(false);
        }
        //Vérfication d'un pion à la bonne place et de la bonne couleur
        for (int i = 0; i<4; i++){
            if (ligne.getChoix().get(i).getCouleur() == plateau.getEssai().get(len).getChoix().get(i).getCouleur()){
                verif.add(new PionVerif(true));
                etat.set(i, true);
            }
        }
        //Vérification de la couleur des pions lorsqu'ils ne sont pas à la bonne place
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if ((ligne.getChoix().get(i).getCouleur() == plateau.getEssai().get(len).getChoix().get(j).getCouleur())&&(etat.get(i)==true)){
                    verif.add(new PionVerif(false));
                    etat.set(i, true);
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
        }
        return trouve;
        }
    }

}
