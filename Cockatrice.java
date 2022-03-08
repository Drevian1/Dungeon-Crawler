package edu.Neumont.oop.Model;

public class Cockatrice extends Monster{
    public Cockatrice() {
        setArmorClass();
        setHealth();
        setChallengeRating();
    }

    @Override
    void setChallengeRating() {
        challengeRating = (1/2);
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(6,6) + 6);
    }

    @Override
    void setArmorClass() {
        armorClass = 11;
    }
//must make save
    @Override
    public int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 3);
        if (hitChance >= armorClass){
            damage = (dice.RollOnce(4) + 1);
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
