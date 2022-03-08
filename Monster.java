package edu.Neumont.oop.Model;

import java.util.ArrayList;

public abstract class Monster {
    Dice dice = new Dice();
    protected int  health;
   protected int armorClass;
   protected double challengeRating;
   ArrayList<Monster>monsters = new ArrayList<>();

    public double getChallengeRating() {
        return challengeRating;
    }

    abstract void setChallengeRating();

    public int getHealth() {
        return health;
    }

    abstract void setHealth();



    public int getArmorClass() {
        return armorClass;
    }

    abstract void setArmorClass();
    public abstract int attack(int armorClass);

}
