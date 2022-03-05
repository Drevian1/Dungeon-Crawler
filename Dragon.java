package edu.Neumont.oop.Model;

public class Dragon extends Monster{
    @Override
    void setChallengeRating() {
        challengeRating = 10;
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(17,10) + 85);
    }

    @Override
    void setArmorClass() {
        armorClass = 20;
    }
    public int fireBreath(int mod){
        int damage;
        if ((dice.RollOnce(20) + mod) < 17){
            damage = dice.rollMultiple(16,6);
        }else{
            damage = (dice.rollMultiple(16,6)/2);
        }
        return damage;
    }

    @Override
    int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 10);
        if (hitChance >= armorClass){
            damage = ((dice.rollMultiple(2,10) + 6));
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        hitChance = (dice.RollOnce(20) + 10);
        if (hitChance >= armorClass){
            damage += ((dice.rollMultiple(2,6) + 6));
        }else{
            damage += 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
