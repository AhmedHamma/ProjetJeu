package fr.ahmed.main;

import java.util.Scanner;

public class Menu {
public static Personnage perso;  // pour stocker création d'un nouveau perso
    public static void main(String args[]) {


        Scanner menu = new Scanner(System.in);
        System.out.println("1 :Crée ton perso bg");
        System.out.println("2 :ou tu peux partir!");
        Integer Input = menu.nextInt();

        if (Input.equals(1)) {
            System.out.println("création de perso");
            System.out.println("1 :Guerrier");
            System.out.println("2 :Mage");
            Integer choixPerso = menu.nextInt();
            if (choixPerso.equals(1)) {
                String NomDuPerso = menu.next();
                perso = new Guerrier(NomDuPerso);
//                guerrier.setNom(NomDuPerso);
                System.out.println(perso.getNom()); // instancier l'objet de la classe guerrier
                System.out.println("Voilà ton guerrier  :" + perso.getNom() + ", ses pdv sont de : " + perso.getVie() + " avec une Hache ses dgt sont de :" + perso.getDegats() + " hf !");
                try {
                    Board board = new Board();
                    board.fillBoard();
                    board.startGame();
                } catch (PersonnageHorsPlateauException e) {
                    System.out.println(e.getMessage());
                }
            }
            if (choixPerso.equals(2)) {
                String NomDuPerso = menu.next();
                perso = new Mage(NomDuPerso);
//                mage.setNom(NomDuPerso);
                System.out.println(perso.getNom());

                System.out.println("Voilà ton mage :" + perso.getNom() + ", ses pdv sont de : " + perso.getVie() + " avec un Baton ses dgt sont de :" + perso.getDegats() + " hf !");
                try {
                    Board board = new Board();
                    board.fillBoard();
                    board.startGame();
                } catch (PersonnageHorsPlateauException e) {
                    System.out.println(e.getMessage());/*e.printStackTrace();*/ // e.getMessage(); car on extend throwable
                }
            }
        }
        if (Input.equals(2)) {
            System.out.println("dégage");
        }


    }


}