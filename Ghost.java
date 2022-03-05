package edu.Neumont.oop.Model;

public class Ghost extends Monster{
    @Override
    void setChallengeRating() {
        challengeRating = 4;
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(10,8));
    }

    @Override
    void setArmorClass() {
        armorClass = 16;
    }

    @Override
    int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 5);
        if (hitChance >= armorClass){
            damage = (dice.rollMultiple(4,6) + 3);
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
