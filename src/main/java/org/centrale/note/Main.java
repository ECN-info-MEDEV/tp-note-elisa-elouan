package org.centrale.note;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {
            System.out.println("Pas d'erreur");
        } catch (Exception e) {
            System.out.println("Erreur : "+e);
        }
    }
}