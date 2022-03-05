package edu.Neumont.oop.Model;

public class Skeleton extends Monster{

    @Override
    void setChallengeRating() {
        challengeRating = (1/4);
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(3,8) + 4);
    }

    @Override
    void setArmorClass() {
        armorClass = 13;
    }

    @Override
    int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 4);
        if (hitChance >= armorClass){
            damage = (dice.RollOnce(6) + 2);
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
