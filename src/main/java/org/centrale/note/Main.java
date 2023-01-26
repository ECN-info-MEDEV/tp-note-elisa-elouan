package org.centrale.note;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {
            Classe1 c = new Classe1();  
            System.out.println(c.concat());
            System.out.println("Pas d'erreur");
        } catch (Exception e) {
            System.out.println("Erreur : "+e);
        }
    }
}