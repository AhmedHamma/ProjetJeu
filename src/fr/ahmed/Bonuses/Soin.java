package fr.ahmed.Bonuses;
import fr.ahmed.main.Case;
public class Soin extends  Case{
    protected int Healing;

    public Soin(String nom,int healing) { super(nom);
       this.Healing = healing;
    }

    @Override
    public String toString() {
        return getNom() +
                "Healing=" + Healing +
                '}';
    }
}
