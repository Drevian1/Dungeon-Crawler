package edu.Neumont.oop.Model;

public class Mimic extends Monster{
    @Override
    void setChallengeRating() {
        challengeRating = 2;
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(9,8) + 18);
    }

    @Override
    void setArmorClass() {
        armorClass = 12;
    }

    @Override
    int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 5);
        if (hitChance >= armorClass){
            damage = ((dice.RollOnce(6) + 3) + dice.RollOnce(4));
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
