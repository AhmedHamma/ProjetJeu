package fr.ahmed.Bonuses.Weapons;

import fr.ahmed.main.Case;
import fr.ahmed.main.Personnage;

public class Weapon extends Case {
    private int Degats;

    public Weapon(String nom, int degats) {
        super(nom);
        this.Degats = degats;
    }

    //    @Override
    public void interact(Personnage perso) {
        if(perso.isWeaponUser()) {
            System.out.println("You find a " + getNom());
            System.out.println("You pick it up and gain " + getDegats() + " damage points");
            perso.setDegats(perso.getDegats() + getDegats());
            System.out.println("You now make " + perso.getDegats() + " damages.");
        } else {
            System.out.println("You can't use this item");
        }
    }

    @Override
    public String toString() {
        return getNom()+
                "Dégats = " + Degats;
    }

    public int getDegats() {
        return Degats;
    }

    public void setDegats(int degats) {
        Degats = degats;
    }
}
