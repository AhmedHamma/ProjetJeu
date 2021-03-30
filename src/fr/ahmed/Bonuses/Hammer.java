package fr.ahmed.Bonuses;

import fr.ahmed.main.Personnage;

public class Hammer extends Bonus{
    public Hammer(String nom, int degats) {
        super(nom, degats);
    }

    public Hammer() {
        super("Hammer", 10);
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
