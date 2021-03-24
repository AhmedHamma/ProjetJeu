package main;

public abstract class Personnage {

    protected String nom;
    protected int vie;
    protected int degats;

    // constructeur

    public Personnage(String nom, int vie, int degats) {
        this.nom = nom;
        this.vie = vie;
        this.degats = degats;
    }

    public static int getRandomInt(int Min, int Max) {
        return Min + (int) (Math.random() * ((Max - Min) + 1));
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getDegats() {
        return degats;
    }

    public void setDegats(int degats) {
        this.degats = degats;
    }


}