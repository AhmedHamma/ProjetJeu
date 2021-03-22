package main;

public class guerrier {

    // Attributs

    private int vie;
    private int degats;
    private String nom;
    private String image;
    // constructeurs

    public guerrier(){
    }

    public guerrier(String nom){
        this.nom = nom;
    }
    public guerrier(String nom, int degats, String image, int vie){
        this.nom = nom;
        this.degats = degats;
        this.image = image;
        this.vie= vie;

    }

    // Accesseurs

    public int getVie(){
        return vie; // return la vie du perso
    }
    public int getDegats(){
        return degats;
    }
    public String getNom(){
        return nom;
    }

    // Setters

    public void setVie(int vie1){
        vie = vie1; // definie la vie du perso
    }

    public void setDegats(int degats1){
        vie = degats1;
    }

    public void setNom(String nom1){
        nom = nom1;
    }
}
