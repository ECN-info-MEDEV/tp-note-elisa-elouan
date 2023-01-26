package org.centrale.note;

public class PionVerif extends Pion {
    private boolean couleur;

    public PionVerif() {
    }

    /**
     * @param couleur
     */
    public PionVerif(boolean couleur) {
        this.couleur = couleur;
    }

    public boolean getCouleur() {
        return couleur;
    }

    /**
     * @param couleur
     */
    public void setCouleur(boolean couleur) {
        this.couleur = couleur;
    }

    
}
