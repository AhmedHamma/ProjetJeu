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

}
