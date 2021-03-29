package fr.ahmed.Enemies;

import fr.ahmed.main.Case;

public class Enemies extends Case {
    private int Degats;
    private int Vie;

    public Enemies(String nom, int vie, int degats) {
        super(nom);
        this.Vie = vie;
        this.Degats= degats;
    }

    @Override
    public String toString() {
        return getNom() +
                "Degats = " + Degats +
                ", Vie = " + Vie;
    }
}
