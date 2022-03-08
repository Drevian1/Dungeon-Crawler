package edu.Neumont.oop.Model;

public class Cultist extends Monster{
    public Cultist() {
        setArmorClass();
        setHealth();
        setChallengeRating();
    }

    @Override
    void setChallengeRating() {
        challengeRating = (1/8);
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(2,8));
    }

    @Override
    void setArmorClass() {

        armorClass = 12;
    }

    @Override
    public int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 3);
        if (hitChance >= armorClass){
            damage = (dice.RollOnce(6) + 1);
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
