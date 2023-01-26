package org.centrale.note;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Jeu jeu = new Jeu();

        try {
            jeu.partie();
        } catch (Exception e) {
            System.out.println("Erreur : "+e);
        }
    }
}