package org.centrale.note;

public class Jeu {
    private Plateau plateau;
    private Joueur joueur1;
    private Joueur joueur2;
    private int trJeu;


    public Jeu(){
        plateau = new Plateau();
        joueur1 = new Joueur(true);
        joueur2 = new Joueur(false);
        trJeu = 0;
    }
    
    
    public Plateau getPlateau() {
        return this.plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    
    public Joueur getJoueur1() {
        return this.joueur1;
    }

    public void setJoueur1(Joueur joueur1) {
        this.joueur1 = joueur1;
    }

    public Joueur getJoueur2() {
        return this.joueur2;
    }

    public void setJoueur2(Joueur joueur2) {
        this.joueur2 = joueur2;
    }

    public int getTrJeu() {
        return this.trJeu;
    }

    public void setTrJeu(int trJeu) {
        this.trJeu = trJeu;
    }
}
