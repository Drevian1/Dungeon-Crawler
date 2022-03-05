package edu.Neumont.oop.Model;

public class Owlbear extends Monster{
    @Override
    void setChallengeRating() {
        challengeRating = 3;
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(7,10) + 21);
    }

    @Override
    void setArmorClass() {
        armorClass = 13;
    }
//attacks twice
    @Override
    int attack(int armorClass) {
        int damage = 0;
        int attacks = 0;
        while(attacks < 2) {
            int hitChance = (dice.RollOnce(20) + 7);
            if (hitChance >= armorClass) {
                damage = (dice.rollMultiple(2, 8) + 5);
                attacks++;
            } else {
                damage = 0;
                System.out.println("Attack missed");
                attacks++;
            }
        }
        return damage;
    }
}
