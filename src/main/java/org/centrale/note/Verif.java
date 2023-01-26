package org.centrale.note;

import java.util.ArrayList;
import java.util.List;

public class Verif {
    private List<PionVerif> verif;

    public List<PionVerif> getVerif() {
        return this.verif;
    }

    public void setVerif(List<PionVerif> verif) {
        this.verif = verif;
    }

    public Verif(){
        List<PionVerif> verif = new ArrayList<PionVerif>();
    }

    public void verifLigne(Ligne ligne, Plateau plateau){

    }

}
