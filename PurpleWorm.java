package edu.Neumont.oop.Model;

public class PurpleWorm extends Monster{
    public PurpleWorm() {
        setArmorClass();
        setHealth();
        setChallengeRating();
    }

    @Override
    void setChallengeRating() {
        challengeRating = 15;
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(15,20) + 90);
    }

    @Override
    void setArmorClass() {
        armorClass = 18;
    }

    @Override
    public int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 14);
        if (hitChance >= armorClass){
            damage = ((dice.rollMultiple(3,8) + 9) + (dice.rollMultiple(4,6)));
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        hitChance = (dice.RollOnce(20) + 14);
        if (hitChance >= armorClass){
            damage += ((dice.rollMultiple(3,6) + 9) + (dice.rollMultiple(7,6)));
        }else{
            damage += 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
