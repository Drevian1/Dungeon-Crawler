package edu.Neumont.oop.Model;

public class Bulette extends Monster{
    public Bulette() {
        setArmorClass();
        setHealth();
        setChallengeRating();
    }

    @Override
    void setChallengeRating() {
        challengeRating = 5;
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(9,10) + 45);
    }

    @Override
    void setArmorClass() {
        armorClass = 17;
    }

    @Override
    public int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 7);
        if (hitChance >= armorClass){
            damage = (dice.rollMultiple(4,12) + 4);
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
