package fr.ahmed.main;

public class Case {
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private String nom;

    public Case(String nom){
        this.nom = nom;

    }

    @Override
    public String toString() {
        return "Case{" +
                "nom='" + nom + '\'' +
                '}';
    }
    public void interaction(Personnage perso){
        System.out.println("---------------------------------------" +
                "\n du loot bg ! c'est à toi (press enter) !"
                + "\n---------------------------------------");
    }

}
