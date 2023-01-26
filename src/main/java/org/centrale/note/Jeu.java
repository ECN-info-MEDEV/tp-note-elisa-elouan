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
    
}
