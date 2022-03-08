package edu.Neumont.oop.Model;

public class Ettin extends Monster{
    public Ettin() {
        setArmorClass();
        setHealth();
        setChallengeRating();
    }

    @Override
    void setChallengeRating() {
        challengeRating = 4;
    }

    @Override
    void setHealth() {
        health  = (dice.rollMultiple(10,10) + 30);
    }

    @Override
    void setArmorClass() {
        armorClass = 12;
    }
//attacks twice
    @Override
    public int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 7);
        if (hitChance >= armorClass){
            damage = (dice.rollMultiple(2,8) + 5);
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
