package fr.ahmed.Bonuses.Spells;

import fr.ahmed.Bonuses.Bonus;
import fr.ahmed.main.Personnage;

public class Fireball extends Spell {
    public Fireball(String nom, int degats) {
        super(nom, degats);
    }

    public Fireball() {
        super("Fireball", 7);
    }

    @Override
    public String toString() {
        return "Une boule de feu bg !" +
                "tu gagnes" + super.getDegats() + "points de dégats";
    }

//    public void interact(Personnage perso){
//        if(perso.isMagicUser()){
//            System.out.println("T'es assez puissant pour prendre ça bg !");
//        }else{
//            System.out.println("oulaa avec ce pti cerveau ?");
//        }
//    }
}
