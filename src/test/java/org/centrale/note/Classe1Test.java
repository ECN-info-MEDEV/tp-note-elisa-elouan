package org.centrale.note;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Classe1Test {

    /**
     * 
     */
    @Test
    public void testConcat() {
        System.out.println("Test de concaténation des attributs de la classe Classe1");
        final String expResult = "50 : Manche";
        final Classe1 c1 = new Classe1();
        final Classe1 c2 = new Classe1(50, "Manche");
        assertTrue(expResult.equals(c1.concat()));
        assertTrue(expResult.equals(c2.concat()));
    }
    

}
