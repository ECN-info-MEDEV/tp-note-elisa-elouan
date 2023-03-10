package org.centrale.note;

import java.util.ArrayList;
import java.util.Scanner;

public class Plateau {
    private int nbLigne;
    private ArrayList<Verif> verif;
    private ArrayList<Ligne> essai;
    private ArrayList<PionCouleur> code;


    public Plateau(){
        nbLigne = 12;
        this.verif = new ArrayList<Verif>();
        this.essai = new ArrayList<Ligne>();
        this.code = new ArrayList<PionCouleur>();
        init(code);
    }
    
    public static void init(ArrayList<PionCouleur> code){
        Boolean invalid = true;
        Scanner sc = new Scanner(System.in) ;
        while (invalid){
            System.out.println("Choisir la couleur des pions (rentrer 4 chiffres de 1 à 6)");
            String s = sc.nextLine();
            int a1 = s.charAt(0) - '0';
            int b2 = s.charAt(1) - '0';
            int c3 = s.charAt(2) - '0';
            int d4 = s.charAt(3) - '0';
            if ((a1<7)&&(a1>0)&&(b2<7)&&(b2>0)&&(c3<7)&&(c3>0)&&(d4<7)&&(d4>0)){
                invalid = false;
            }
            PionCouleur a = new PionCouleur(a1);
            code.add(a);
            PionCouleur b = new PionCouleur(b2);
            code.add(b);
            PionCouleur c = new PionCouleur(c3);
            code.add(c);
            PionCouleur d = new PionCouleur(d4);
            code.add(d);
            System.out.println("Le code est rentré");
        }

    }

    
    public int getNbLigne() {
        return this.nbLigne;
    }

    public void setNbLigne(int nbLigne) {
        this.nbLigne = nbLigne;
    }

    public ArrayList<Verif> getVerif() {
        return this.verif;
    }

    public void setVerif(ArrayList<Verif> verif) {
        this.verif = verif;
    }

    public ArrayList<Ligne> getEssai() {
        return this.essai;
    }

    public void setEssai(ArrayList<Ligne> essai) {
        this.essai = essai;
    }

    public ArrayList<PionCouleur> getCode() {
        return this.code;
    }

    public void setCode(ArrayList<PionCouleur> code) {
        this.code = code;
    }

    public void affichePlateau(){
        System.out.println("");
        System.out.println("");
        System.out.println("Choix de couleur    Analyse");
        System.out.println("");
        for (int i=0;i<this.essai.size();i++){
            try{
                this.essai.get(i).afficheLigne();
                this.verif.get(i).afficheVerif();
            } catch (Exception e) {
                System.out.println("Pas de ligne à afficher");
            }
        }
    }


}
