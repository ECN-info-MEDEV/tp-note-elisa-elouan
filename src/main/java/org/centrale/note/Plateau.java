package org.centrale.note;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Plateau {
    private int nbLigne;
    private List<Verif> verif;
    private List<Ligne> essai;
    private List<Pion> code;

    public Plateau(){
        nbLigne = 12;
        verif = new Linkedlist<>();
        essai = new LinkedList<>();
        code = new LinkedList<>();
        init(essai, verif);
    }
    
    public void init(LinkedList code){
        Boolean invalid = true;
        while (invalid){
            System.out.println("Choisir la couleur des pions (rentrer 4 chiffres de 1 à 6");
            Scanner sc = new Scanner(System.in) ;
            String s = sc.nextLine();
            int a = s.charAt(0) - '0';
            int b = s.charAt(1) - '0';
            int c = s.charAt(2) - '0';
            int d = s.charAt(3) - '0';
            if ((a<7)&&(a>0)&&(b<7)&&(b>0)&&(c<7)&&(c>0)&&(d<7)&&(d>0)){
                invalid = false;
            }
            code.append(a);
            code.append(b);
            code.append(c);
            code.append(d);
        }

    }

}
