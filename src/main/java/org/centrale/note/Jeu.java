package org.centrale.note;

import java.util.Scanner;

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
    
    public Boolean tourJeu(){
        Boolean trouve;
        plateau.getEssai().add(new Ligne());        
        int len = plateau.getEssai().size();
        Boolean invalid = true;
        Scanner sc = new Scanner(System.in) ;
        PionCouleur a = new PionCouleur() ;
        PionCouleur b = new PionCouleur();
        PionCouleur c = new PionCouleur();
        PionCouleur d = new PionCouleur();
        while (invalid){
            System.out.println("Choisir la couleur des pions (rentrer 4 chiffres de 1 à 6");
            String s = sc.nextLine();
            int a1 = s.charAt(0) - '0';
            int b2 = s.charAt(1) - '0';
            int c3 = s.charAt(2) - '0';
            int d4 = s.charAt(3) - '0';
            if ((a1<7)&&(a1>0)&&(b2<7)&&(b2>0)&&(c3<7)&&(c3>0)&&(d4<7)&&(d4>0)){
                invalid = false;
            }
            a.setCouleur(a1);
            b.setCouleur(b2);
            c.setCouleur(c3);
            d.setCouleur(d4);
        }
        plateau.getEssai().get(len).remplirLigne(a, b, c, d);
        plateau.getVerif().add(new Verif());
        Verif ligneToVerif = plateau.getVerif().get(len);
        trouve = ligneToVerif.verifLigne(plateau.getEssai().get(len),plateau);
        return trouve;
    }

    public void partie(){
        Boolean trouve = false;
        int tr = 1;
        while ((!trouve)&&(tr < 13)){
            trouve = tourJeu();
            tr++;
        }
        if (joueur1.getRole()){
            joueur1.setScore(joueur1.getScore()+(12-tr));
        }
        if (joueur2.getRole()){
            joueur2.setScore(joueur2.getScore()+(12-tr));
        }
        joueur1.setRole(!joueur1.getRole());
        joueur2.setRole(!joueur2.getRole());
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
