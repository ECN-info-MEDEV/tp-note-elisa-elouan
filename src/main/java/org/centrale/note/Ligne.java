package org.centrale.note;

import java.util.LinkedList;
import java.util.List;

public class Ligne {
    private LinkedList<PionCouleur> choix;

    public Ligne() {
        this.choix = new LinkedList<PionCouleur>();
    }

    /**
     * @param choix
     */
    public Ligne(LinkedList<PionCouleur> choix) {
        this.choix = choix;
    }

    public LinkedList<PionCouleur> getChoix() {
        return choix;
    }

    /**
     * @param choix
     */
    public void setChoix(LinkedList<PionCouleur> choix) {
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
