package fr.ahmed.Bonuses;

import fr.ahmed.main.Personnage;

public class Sword extends Bonus{
    public Sword(String nom, int degats) {
        super(nom, degats);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void interact(Personnage perso){
        if(perso.isWeaponUser()){
            System.out.println("T'es assez balèze pour prendre ça bg !");
        }else{
            System.out.println("oulaa avec ces pti bras?");
        }
    }
}
