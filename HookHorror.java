package edu.Neumont.oop.Model;

public class HookHorror extends Monster{
    public HookHorror() {
        setArmorClass();
        setHealth();
        setChallengeRating();
    }

    @Override
    void setChallengeRating() {
        challengeRating = 3;
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(10,10) + 20);
    }

    @Override
    void setArmorClass() {
        armorClass = 15;
    }

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
