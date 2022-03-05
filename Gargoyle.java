package edu.Neumont.oop.Model;

public class Gargoyle extends Monster{
    @Override
    void setChallengeRating() {
        challengeRating = 2;
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(7,8) + 21);
    }

    @Override
    void setArmorClass() {
        armorClass = 15;
    }
//attacks twice
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
        hitChance = (dice.RollOnce(20) + 4);
        if (hitChance >= armorClass){
            damage += (dice.RollOnce(6) + 2);
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
