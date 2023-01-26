package org.centrale.note;

import java.util.ArrayList;

public class Ligne {
    private ArrayList<PionCouleur> choix;


    public Ligne() {
        this.choix = new ArrayList<PionCouleur>();
    }

    /**
     * @param choix
     */
    public Ligne(ArrayList<PionCouleur> choix) {
        this.choix = choix;
    }

    public ArrayList<PionCouleur> getChoix() {
        return choix;
    }

    /**
     * @param choix
     */
    public void setChoix(ArrayList<PionCouleur> choix) {
        this.choix = choix;
    }

    /**
     * Remplit la ligne avec les pions choisis.
     * @param c0 1er pion
     * @param c1 2nd pion
     * @param c2 3eme pion
     * @param c3 4eme pion
     */
    public void remplirLigne(PionCouleur c0, PionCouleur c1, PionCouleur c2, PionCouleur c3){
        this.choix.add(c0);
        this.choix.add(c1);
        this.choix.add(c2);
        this.choix.add(c3);
    }

    
}
