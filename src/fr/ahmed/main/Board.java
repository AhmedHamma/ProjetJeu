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
    public  void startGame() throws PersonnageHorsPlateauException {
        boolean keepPlaying = false;
        int nbrDeCases = 64;
        int currentCase;
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
                }

                System.out.println("tu es sur la case: " + currentCase + "/" + nbrDeCases);
            }
        } while (keepPlaying);

    }


    private static int diceRoll() {
        return (int) Math.ceil(Math.random() * 6);
    }

    public void fillBoard() {

        for (int i = 0; i <= 64; i++) { // boucle for
            if ((i == 19) || (i == 26) || (i == 42) || (i == 53)) {
                board.add(new Dragon("Dragoune", 10, 2));
            } else if (i == 28 || i == 46 || i == 54) {
                board.add(new Goblin("Goblinkun", 8, 1));
            } else if ((i == 13) || (i == 29) || (i == 34) || (i == 51)) {
                board.add(new Witcher("Henry", 6, 3));
            } else if (i == 9 || i == 14 || i == 33) {
                board.add(new Fireball());
            } else if ((i == 8) || (i == 12) || (i == 27) || (i == 36)) {
                board.add(new Hammer());
            } else if ((i == 7) || (i == 15) || (i == 38) || (i == 52)) {
                board.add(new Thunder("Thunder", 9));
            } else if ((i == 2) || (i == 4) || (i == 41) || (i == 44)) {
                board.add(new Sword("Epée", 4));
            } else if ((i == 11) || (i == 16) || (i == 25) || (i == 32)) {
                board.add(new LittlePotion());
            } else if ((i == 21) || (i == 39) || (i == 49) || (i == 59)) {
                board.add(new SuperPotion());
            }else{
                board.add(null);
            }


        }
        System.out.println(board.size());
    }
}