package org.centrale.note;

public class Joueur {
    private Boolean role;
    private int score;  
    
    public Joueur(Boolean role){
        this.role =  role;
        score = 0;
    }

    public Boolean getRole() {
        return this.role;
    }

    public void setRole(Boolean role) {
        this.role = role;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
