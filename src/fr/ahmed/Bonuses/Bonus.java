package fr.ahmed.Bonuses;
import fr.ahmed.main.Case;
public class Bonus extends Case {
    protected int Degats;

    public Bonus(String nom, int degats) {
        super(nom);
        this.Degats = degats;
    }

    @Override
    public String toString() {
        return getNom() +
                "Degats = " + Degats ;
    }
}
