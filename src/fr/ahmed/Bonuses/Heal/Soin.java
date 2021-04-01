package fr.ahmed.Bonuses.Heal;
import fr.ahmed.main.Case;
import fr.ahmed.main.Personnage;

public abstract class Soin extends  Case{
    protected int Healing;

    public Soin(String nom,int healing) {
        super(nom);
        this.Healing = healing;
    }

//    public void interact(Personnage perso) {
//
//            System.out.println("You find a " + getNom());
//            System.out.println("You pick it up and gain " + () + " damage points");
//            perso.setDegats(perso.getDegats() + getDegats());
//            System.out.println("You now make " + perso.getDegats() + " damages.");
//
//    }

    @Override
    public String toString() {
        return getNom() +
                "Healing=" + Healing +
                '}';
    }
}
