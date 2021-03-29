package fr.ahmed.Bonuses;

public class SuperPotion extends Soin{
    public SuperPotion(String nom, int healing) {
        super(nom, healing);
    }

    public SuperPotion() {
        super("LA Super POPO", 40);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
