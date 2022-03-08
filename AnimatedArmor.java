package edu.Neumont.oop.Model;

public class AnimatedArmor extends Monster{
    public AnimatedArmor() {
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
        health = (dice.rollMultiple(6,8) + 6);
    }

    @Override
    void setArmorClass() {
        armorClass = 18;
    }
//attacks twice
    @Override
    public int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 4);
        if (hitChance >= armorClass){
            damage = (dice.RollOnce(6) + 2);
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
