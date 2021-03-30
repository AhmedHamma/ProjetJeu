package fr.ahmed.main;

import fr.ahmed.Bonuses.Bonus;

public abstract class Personnage {

    protected String nom;
    protected int vie;
    protected int degats;
// 2 variable cancarry magic and weapons par defaut false
    protected boolean magicUser = false;
    protected boolean weaponUser = false;
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

    public boolean isMagicUser() {
        return magicUser;
    }

    public void setMagicUser(boolean magicUser) {
        this.magicUser = magicUser;
    }

    public boolean isWeaponUser() {
        return weaponUser;
    }

    public void setWeaponUser(boolean weaponUser) {
        this.weaponUser = weaponUser;
    }

//    public abstract void updateDegats(Bonus bonus);
}