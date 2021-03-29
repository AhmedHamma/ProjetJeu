package fr.ahmed.Bonuses;

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
}
