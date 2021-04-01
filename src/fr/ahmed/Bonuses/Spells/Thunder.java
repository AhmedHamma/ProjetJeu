package fr.ahmed.Bonuses.Spells;

import fr.ahmed.Bonuses.Bonus;
import fr.ahmed.main.Personnage;

public class Thunder extends Spell {
    public Thunder(String nom, int degats) {
        super(nom, degats);
    }

    public Thunder() {
        super("Thunder", 4);
    }

//    @Override
    public String toString() {
        return super.getNom() + " - " +
                "Strength = " + super.getDegats();

    }
//    @Override
//    public String toString() {
//        return "Un éclair bg !" +
//                "tu gagnes" + super.getDegats() + "points de dégats";
//    }

//    public void interact(Personnage perso){
//        if(perso.isMagicUser()){
//            System.out.println("T'es assez puissant pour prendre ça bg !");
//        }else{
//            System.out.println("oulaa avec ce pti cerveau ?");
//        }
//    }
}
