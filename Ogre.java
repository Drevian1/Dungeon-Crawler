package edu.Neumont.oop.Model;

public class Ogre extends Monster{
    public Ogre() {
        setArmorClass();
        setHealth();
        setChallengeRating();
    }

    @Override
    void setChallengeRating() {
        challengeRating = 2;
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(7,10) + 21);
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
            damage = (dice.rollMultiple(2,8) + 4);
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        hitChance = (dice.RollOnce(20) + 6);
        if (hitChance >= armorClass){
            damage += (dice.rollMultiple(2,8) + 4);
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
