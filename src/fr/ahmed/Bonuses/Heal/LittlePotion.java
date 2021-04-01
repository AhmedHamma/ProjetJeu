package fr.ahmed.Bonuses.Heal;

public class LittlePotion extends Soin {
    public LittlePotion(String nom, int healing) {
        super(nom, healing);
    }

    public LittlePotion() {
        super("Ptite Potion", 4);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
