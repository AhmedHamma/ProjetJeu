package main;

public class Mage extends Personnage {
    // Attributs

//    private int vie;
//    private int degats;
//    private String nom;
    private String image;
    private String Philtre;
    private String Spell;
    // constructeurs

    public Mage(String nom) {
        super(nom, Personnage.getRandomInt(3,6), Personnage.getRandomInt(8,15));

//
//        this.nom = this.getNom();
//        this.vie = this.getRandomInt(5, 10);
//        this.degats = this.getRandomInt(5, 10);
    }

//    public Mage(String nom) {
//        this.nom = nom;
//    }
//
//    public Mage(String nom, int degats, String image, int vie) {
//        this.nom = nom;
//        this.degats = degats;
//        this.image = image;
//        this.vie = vie;
//
//    }

//    // Accesseurs
//
//    public int getVie() {
//        return vie; // return la vie du perso
//    }
//
//    public int getDegats() {
//        return degats;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//
//    public int getRandomInt(int Min, int Max) {
//        return Min + (int) (Math.random() * ((Max - Min) + 1));
//    }
//
//    // Setters
//
//    public void setVie(int vie1) {
//        vie = vie1; // definie la vie du perso
//    }
//
//    public void setDegats(int degats1) {
//        vie = degats1;
//    }
//
//    public void setNom(String nom1) {
//        nom = nom1;
//    }
}
