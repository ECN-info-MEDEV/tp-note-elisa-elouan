package org.centrale.note;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Plateau p = new Plateau();

        try {
            p.affichePlateau();
            System.out.println("Pas d'erreur");
        } catch (Exception e) {
            System.out.println("Erreur : "+e);
        }
    }
}