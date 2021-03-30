package fr.ahmed.main;

import fr.ahmed.Bonuses.*;
import fr.ahmed.Enemies.Dragon;
import fr.ahmed.Enemies.Goblin;
import fr.ahmed.Enemies.Witcher;


import java.util.ArrayList;

public class Board {
    private ArrayList<Case> board;
    private int currentCase;

    public Board() {
        this.currentCase = 0;
        board = new ArrayList<>();

    }

    public void startGame() throws PersonnageHorsPlateauException {
        boolean keepPlaying = false;
        int nbrDeCases = 64;
//        int currentCase;
        int diceResult;

        do {
            currentCase = 1; // ranger ça dans le plateau

            while (currentCase < nbrDeCases) {
                diceResult = diceRoll();
                System.out.println("prrrrrrrrrrr tadaa: " + diceResult);

                if (currentCase + diceResult > nbrDeCases) {
                    throw new PersonnageHorsPlateauException();
//                    System.out.println("trop loin bg.. aventurier !");
//                    currentCase = 64;


                } else {
                    currentCase += diceResult;
                    Case ccase = board.get(currentCase); // pour afficher le bonus de la case
                    if(ccase instanceof Bonus){
                        Bonus bonus = (Bonus) ccase;
                        bonus.interact(Menu.perso);
                    }
                }

                System.out.println("tu es sur la case: " + currentCase + "/" + nbrDeCases);
                System.out.println(board.get(currentCase));
            }
        } while (keepPlaying);

    }


    private static int diceRoll() {
        return (int) Math.ceil(Math.random() * 6);
    }

    public void fillBoard() {

        for (int i = 0; i <= 64; i++) { // boucle for
            if ((i == 45) || (i == 52) || (i == 56) || (i == 62)) {
                board.add(new Dragon("Dragoune", 10, 2));
            } else if ((i == 3) || (i == 6) || (i == 9) || (i == 12) || (i == 15) || (i == 18) || (i == 21) || (i == 24) || (i == 27) || (i == 30)) {
                board.add(new Goblin("Goblinkun", 8, 1));
            } else if ((i == 10) || (i == 20) || (i == 25) || (i == 32) || (i == 35) || (i == 36) || (i == 37) || (i == 40) || (i == 44) || (i == 47)) {
                board.add(new Witcher("Henry", 6, 3));
            } else if (i == 48 || i == 49 ) {
                board.add(new Fireball());
            } else if ((i == 2) || (i == 11) || (i == 5) || (i == 22) || (i == 28)) {
                board.add(new Hammer());
            } else if ((i == 1) || (i == 4) || (i == 8) || (i == 17) || (i == 23)) {
                board.add(new Thunder("Thunder", 9));
            } else if ((i == 19) || (i == 26) || (i == 42) || (i == 53)) {
                board.add(new Sword("Epée", 4));
            } else if ((i == 7) || (i == 13) || (i == 31) || (i == 33) || (i == 39) || (i == 43)) {
                board.add(new LittlePotion());
            } else if ((i == 28) || (i == 41)) {
                board.add(new SuperPotion());
            } else {
                board.add(null);
            }


        }
//        System.out.println(board.size());


    }
}