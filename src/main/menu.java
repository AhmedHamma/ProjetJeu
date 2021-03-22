package main;
import java.sql.SQLOutput;
import java.util.Scanner;

public class menu {

    public static void main (String args[]){


        Scanner menu = new Scanner(System.in);
        System.out.println("1 :Crée ton perso bg");
        System.out.println("2 :ou tu peux partir!");
        Integer Input = menu.nextInt();
        if (Input.equals(1)){
            System.out.println("création de perso");
            System.out.println("1 :Guerrier");
            System.out.println("2 :Mage");
            Integer choixPerso = menu.nextInt();
                if(choixPerso.equals(1)){
                    guerrier Guerrier = new guerrier();
                    System.out.println(Guerrier.getNom()); // instancier l'objet de la classe guerrier
            }
                if(choixPerso.equals(2)){
                    mage Mage = new mage();
                    System.out.println(Mage.getNom());
            }
        }
        if (Input.equals(2)){
            System.out.println("dégage");
        }


    }


}
