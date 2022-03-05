package edu.Neumont.oop.Model;

public class Balor extends Monster{
    @Override
    void setChallengeRating() {
        challengeRating = 19;
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(21,12) + 126);
    }

    @Override
    void setArmorClass() {
        armorClass = 19;
    }
    public int deathThroes(int mod){
        int damage;
        if ((dice.RollOnce(20) + mod) < 20){
            damage = (dice.rollMultiple(20,6));
        }else {
            damage = (dice.rollMultiple(20,6)/2);
        }

        return damage;
    }

    @Override
    int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 14);
        if (hitChance >= armorClass){
            damage = ((dice.rollMultiple(3,8) + 8)) + ((dice.rollMultiple(3,8)));
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        hitChance = (dice.RollOnce(20) + 14);
        if (hitChance >= armorClass){
            damage += ((dice.rollMultiple(2,6) + 8)) + ((dice.rollMultiple(3,6)));
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
