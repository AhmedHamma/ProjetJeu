package main;

import java.sql.SQLOutput;
import java.util.Scanner;

public class menu {

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
                Guerrier guerrier = new Guerrier();
                guerrier.setNom(NomDuPerso);
                System.out.println(guerrier.getNom()); // instancier l'objet de la classe guerrier
                System.out.println("Voilà ton guerrier  :" + guerrier.getNom() + ", ses pdv sont de : " + guerrier.getVie() + " avec une Hache ses dgt sont de :" + guerrier.getDegats() + " hf !");
                startGame();
            }
            if (choixPerso.equals(2)) {
                String NomDuPerso = menu.next();
                Mage mage = new Mage();
                mage.setNom(NomDuPerso);
                System.out.println(mage.getNom());
                System.out.println("Voilà ton mage :" + mage.getNom() + ", ses pdv sont de : " + mage.getVie() + " avec un Baton ses dgt sont de :" + mage.getDegats() + " hf !");
                startGame();
            }
        }
        if (Input.equals(2)) {
            System.out.println("dégage");
        }


    }

    public static void startGame() {
        boolean keepPlaying = false;
        int nbrDeCases = 64;
        int currentCase;
        int diceResult;

        do {
            currentCase = 1;

            while (currentCase < 64) {
                diceResult = diceRoll();
                System.out.println("prrrrrrrrrrr tadaa: " + diceResult);

                if (currentCase + diceResult > 64) {
                    System.out.println("trop loin bg.. aventurier !");
                    currentCase = 64;

                } else {
                    currentCase += diceResult;
                }

                System.out.println("tu es sur la case: " + currentCase + "/" + nbrDeCases);
            }
        } while (keepPlaying);

    }


    private static int diceRoll() {
        return (int) Math.ceil(Math.random() * 6);
    }

}