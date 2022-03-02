package edu.Neumont.oop.Model;

import java.util.Random;

public class Dice {

    Random rnd = new Random();

    public int RollOnce(int sides){
        int rnd = this.rnd.nextInt(sides) + 1;
        return rnd;
    }
    public int rollMultiple(int numDice, int sides){
        int total = 0;
        int results;

        for (int i = 0; i < numDice; i++) {
            results = RollOnce(sides);
            total = total + results;
        }
        return total;
    }
}
