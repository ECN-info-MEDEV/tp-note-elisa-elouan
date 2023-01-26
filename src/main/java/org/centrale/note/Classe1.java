package org.centrale.note;

public class Classe1 {
    private int var1;
    private String var2;

    public Classe1(){
        this.var1 = 50;
        this.var2 = "Manche";
    }

    public Classe1(int v1, String v2){
        this.var1 = v1;
        this.var2 = v2;
    }

    /**
     * @return int return the var1
     */
    public int getVar1() {
        return var1;
    }

    /**
     * @param var1 the var1 to set
     */
    public void setVar1(int var1) {
        this.var1 = var1;
    }

    /**
     * @return String return the var2
     */
    public String getVar2() {
        return var2;
    }

    /**
     * @param var2 the var2 to set
     */
    public void setVar2(String var2) {
        this.var2 = var2;
    }

    /**
     * Concatène les attributs de la classe
     */
    public String concat() {
        return(this.var1 + " : " + this.var2);
    }
}
