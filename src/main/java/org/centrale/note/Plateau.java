package org.centrale.note;

import java.util.ArrayList;
import java.util.List;
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
        while (invalid){
            System.out.println("Choisir la couleur des pions (rentrer 4 chiffres de 1 à 6");
            Scanner sc = new Scanner(System.in) ;
            String s = sc.nextLine();
            int a1 = s.charAt(0) - '0';
            int b2 = s.charAt(1) - '0';
            int c3 = s.charAt(2) - '0';
            int d4 = s.charAt(3) - '0';
            if ((a1<7)&&(a1>0)&&(b2<7)&&(b2>0)&&(c3<7)&&(c3>0)&&(d4<7)&&(d4>0)){
                invalid = false;
            }
            PionCouleur a = new PionCouleur();
            a.setCouleur(a1);
            code.add(a);
            PionCouleur b = new PionCouleur();
            b.setCouleur(b2);
            code.add(b);
            PionCouleur c = new PionCouleur();
            c.setCouleur(c3);
            code.add(c);
            PionCouleur d = new PionCouleur();
            d.setCouleur(d4);
            code.add(d);
        }

    }

}
