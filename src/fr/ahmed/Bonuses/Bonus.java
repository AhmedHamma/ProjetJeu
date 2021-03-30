package fr.ahmed.Bonuses;
import fr.ahmed.main.Case;
import fr.ahmed.main.Personnage;

public abstract class Bonus extends Case {
    protected int Degats;

    public Bonus(String nom, int degats) {
        super(nom);
        this.Degats = degats;
    }

    public abstract void interact(Personnage perso);

//    public void updateStats(Personnage perso){
//        perso.updateDegats(this);
//    }
    @Override
    public String toString() {
        return getNom() +
                "Degats = " + Degats ;
    }
}
