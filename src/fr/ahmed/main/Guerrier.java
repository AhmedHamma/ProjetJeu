package fr.ahmed.main;

public class Guerrier extends Personnage {

    // Attributs

//    private int vie;
//    private int degats;
//    private String nom;
    private String image;
    private String weapon;
    private String shield;


    // constructeurs

    public Guerrier(String nom) {

        super(nom, Personnage.getRandomInt(5,10), Personnage.getRandomInt(5,10));
//        this.nom = this.getNom();
//        this.vie = this.getRandomInt(5,10);
//        this.degats = this.getRandomInt(5,10);

    }

    @Override
    public String toString() { // pour afficher c'est print objet.toString
        return "Guerrier{" +
                "image='" + image + '\'' +
                ", weapon='" + weapon + '\'' +
                ", shield='" + shield + '\'' +
                ", nom='" + nom + '\'' +
                ", vie=" + vie +
                ", degats=" + degats +
                '}';
    }
    //    public Guerrier(String nom) {
//        this.nom = nom;
//    }
//
//    public Guerrier(String nom, int degats, String image, int vie) {
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
//    public int getRandomInt(int Min, int Max){
//        return Min + (int)(Math.random() * ((Max - Min) + 1));
//    }
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
