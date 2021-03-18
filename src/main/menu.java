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
        }
        if (Input.equals(2)){
            System.out.println("dégage");
        }

    }
}
