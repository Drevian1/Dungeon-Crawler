package edu.Neumont.oop.Model;

public class SkeletalColossus extends Monster{
    @Override
    void setChallengeRating() {
        challengeRating = 15;
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(15,20) + 40);
    }

    @Override
    void setArmorClass() {
        armorClass = 14;
    }

    @Override
    int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 10);
        if (hitChance >= armorClass){
            damage = ((dice.rollMultiple(2,8) + 4));
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        hitChance = (dice.RollOnce(20) + 10);
        if (hitChance >= armorClass){
            damage += ((dice.rollMultiple(2,6) + 4));
        }else{
            damage += 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
