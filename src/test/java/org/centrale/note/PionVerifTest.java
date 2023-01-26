package org.centrale.note;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class PionVerifTest {

    Plateau p = new Plateau();
    PionCouleur pion = new PionCouleur(1);
    Ligne ligne = new Ligne(pion, pion, pion, pion);
    List<PionCouleur> code = new ArrayList<PionCouleur>();

    for (int i = 0; i <4; i++){
        code.add(pion);
    }
    p.setCode(code);
    p.getEssai().add(ligne);


    @Test
    void testVerifLigne(){
        assertTrue(p.getVerif().get(0).verifLigne(p.getEssai().get(0), p));
    }

    
}
