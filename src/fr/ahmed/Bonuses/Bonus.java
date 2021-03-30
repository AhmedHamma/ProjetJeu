package fr.ahmed.Bonuses;
import fr.ahmed.main.Case;
import fr.ahmed.main.Guerrier;
import fr.ahmed.main.Mage;
import fr.ahmed.main.Personnage;

public abstract class Bonus extends Case {
    protected int Degats;

    public Bonus(String nom, int degats) {
        super(nom);
        this.Degats = degats;
    }

    public  void interact(Personnage perso) {
        if (perso instanceof Guerrier) {
            System.out.println("T'es assez balèze pour prendre ça bg !");
            System.out.println(this);
            perso.setDegats(perso.getDegats() + this.Degats);
            System.out.println("tes nvx dgts snt de " + perso.getDegats());
        }else if (perso instanceof Mage) {
                System.out.println("T'es assez puissant pour prendre ça bg !");
                System.out.println(this);
                perso.setDegats(perso.getDegats() + this.Degats);
                System.out.println("tes nvx dgts snt de " + perso.getDegats());
        }

    }

//    public void updateStats(Personnage perso){
//        perso.updateDegats(this);
//    }
    @Override
    public String toString() {
        return getNom() +
                "Degats = " + Degats ;
    }
}
