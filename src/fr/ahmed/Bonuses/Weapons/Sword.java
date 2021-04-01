package fr.ahmed.Bonuses.Weapons;

import fr.ahmed.Bonuses.Bonus;
import fr.ahmed.main.Personnage;

public class Sword extends Weapon {
    public Sword(String nom, int degats) {
        super(nom, degats);
    }

    public Sword() {
        super("Sword", 10);
    }

//    @Override
//    public String toString() {
//
//        return "t'as trouvé un Marteau bg !" +
//                "tu gagnes" + super.getDegats() + "points de dégats";
//    }

//    public void interact(Personnage perso){
//        if(perso.isWeaponUser()){
//            System.out.println("T'es assez balèze pour prendre ça bg !");
//            perso.setDegats(perso.getDegats() + this.getDegats());
//            System.out.println("tes nvx dgts snt de " + perso.getDegats());
//        }else{
//            System.out.println("oulaa avec ces pti bras?");
//        }
//    }
    }

//    public void interact(Personnage perso){
//        if(perso.isWeaponUser()){
//            System.out.println("T'es assez balèze pour prendre ça bg !");
//        }else{
//            System.out.println("oulaa avec ces pti bras?");
//        }
//    }

