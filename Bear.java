package edu.Neumont.oop.Model;

public class Bear  extends Monster{

    public Bear() {
        setArmorClass();
        setHealth();
        setChallengeRating();
    }

    @Override
    void setChallengeRating() {
        challengeRating = 1;
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(4,10) + 12);
    }

    @Override
    void setArmorClass() {
        armorClass = 11;
    }
//attacks twice
    @Override
    public int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 6);
        if (hitChance >= armorClass){
            damage = (dice.rollMultiple(2,6) + 4);
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
