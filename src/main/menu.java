package main;
import java.sql.SQLOutput;
import java.util.Scanner;
public class menu {
    public static void main (String args[]){
        String nouveauPerso;
        String quitter;
        Scanner menu = new Scanner(System.in);
        System.out.print("Crée ton perso bg");
        nouveauPerso = menu.nextLine();
        System.out.println(nouveauPerso);

        System.out.println("ou tu peux partir!");
        menu.close();
    }
}
