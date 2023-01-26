package org.centrale.note;

public class PionCouleur extends Pion {
    private int couleur;

    public PionCouleur() {
    }

    /**
     * @param couleur
     */
    public PionCouleur(int couleur) {
        this.couleur = couleur;
    }

    public int getCouleur() {
        return couleur;
    }

    /**
     * @param couleur
     */
    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }
    
}
