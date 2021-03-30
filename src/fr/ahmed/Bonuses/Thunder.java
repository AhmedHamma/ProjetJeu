package fr.ahmed.Bonuses;

import fr.ahmed.main.Personnage;

public class Thunder extends Bonus{
    public Thunder(String nom, int degats) {
        super(nom, degats);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void interact(Personnage perso){
        if(perso.isMagicUser()){
            System.out.println("T'es assez puissant pour prendre ça bg !");
        }else{
            System.out.println("oulaa avec ce pti cerveau ?");
        }
    }
}
